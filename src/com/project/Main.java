package com.project;

public class Main 
{
	public static void main(String[] args) 
	{
		int array[] = new int[1000000];
		int elementToFind = 777777;
		
		for(int i=0; i<array.length; i++) array[i] = i;
		
		int index = binarySearch(array, elementToFind);
		
		if (index==-1) System.out.println("Element not found.");
		else System.out.println("Element found at index : " + index);
	}

	private static int binarySearch(int[] array, int elementToFind) 
	{
		int low = array[0];
		int high = array[array.length-1];
		
		while(low<=high)
		{
			int middle = low + (high-low)/2;
			int middleElement = array[middle];
			
			System.out.println("Middle : "+ middle);
			
			if (middleElement>elementToFind) high = middle + 1;
			else if (middleElement<elementToFind) low = middle-1;
			else return middle;
		}
		
		return -1;
	}
}
