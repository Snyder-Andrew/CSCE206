/* Andrew Snyder
 * 9/5/2024
 * to sort inputed numbers from smallest to largest in an array
 */
package lab00;

import java.util.Scanner;


public class BubbleSorter
{
	public static final int ARRAY_SIZE = 10;
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter "+ARRAY_SIZE+" numbers and I'll sort them");
		int[] array = new int[ARRAY_SIZE];
		for (int i=0; i<array.length; i++)
		{
			System.out.println("Enter value "+i);
			array[i] = keyboard.nextInt();
		}
		
		//Bubble sort
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i=0; i<array.length-1; i++)
				if(array[i]>array[i+1])
				{
					//Swap
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					hasSwapped = true;
				}
		keyboard.close();
		}
		
		//Print the array
		for (int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}

}