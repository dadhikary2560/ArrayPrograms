package com.Array2;


//5. Replace each element with count of smaller elements
public class ReplaceEachElementWithSmallerElementsCount {
public static void main(String[] args) {
	int arr[]= {8, 1, 2, 2, 3};
	
	
	for(int i=0;i<arr.length;i++)
	{
		int counter=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<arr[i])
				counter++;
		}
		System.out.print(counter+" ");
	}
}
}
