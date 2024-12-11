package src;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class SCarpet extends Canvas
{
	//Look into action listeners
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("S Carpet");
		frame.setSize(300, 300);
		
		SCarpet sp = new SCarpet();
		frame.add(sp);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		drawCarpet(0, 0, this.getSize().height, g);
	}
	
	public void drawCarpet(int x, int y, int side, Graphics g)
	{
		int sub = side / 3;
		g.fillRect(x+sub, y+sub, sub, sub);
		if (sub>=3)
		{
			drawCarpet(x, y, sub, g);
			drawCarpet(x+sub, y, sub, g);
			drawCarpet(x+sub+sub, y, sub, g);
			drawCarpet(x, y+sub, sub, g);
			drawCarpet(x+sub+sub, y+sub, sub, g);
			drawCarpet(x, y+sub+sub, sub, g);
			drawCarpet(x+sub, y+sub+sub, sub, g);
			drawCarpet(x+sub+sub, y+sub+sub, sub, g);
		}
	}
}