package com.Array;


//Find the maximum and minimum element in a single traversal.
public class MaxANDminInOneTraversal {
public static void main(String[] args) {
	int arr[]= {4,10,5,8,2};
	int max=0;
	int smallest=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<smallest)
		{
			smallest=arr[i];
		}
		else
			max=arr[i];
	}
	System.out.println("max value of the array: "+max);
	System.out.println("smallest value of the array: "+smallest);
}
}
