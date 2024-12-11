package src;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{

	public static void main(String[] args)
	{
		Scanner inputReader = new Scanner(System.in);
//		System.out.print("Welcome to the sorter. Enter the size of the array. ");
		int size = 52;
		Card[] arr = new Card[size];
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = new Card();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			int smallestIndex = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j].getID()<arr[smallestIndex].getID())
					smallestIndex = j;
			}
			if (smallestIndex!=i)
			{
				int temp = arr[i].getID();
				arr[i].setID(arr[smallestIndex].getID());
				arr[smallestIndex].setID(temp);
			}
		}
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i].getID()+" ");
		
		System.out.println();
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		inputReader.close();
	}
}