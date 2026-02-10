package com.Array;


//Find the maximum and minimum element in a single traversal.
public class MaxANDminInOneTraversal {
public static void main(String[] args) {
	int arr[]= {-100,4,10,-60,5,8,2};
	int large=arr[0];
	int smallest=arr[0];
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>large)
		{
			large=arr[i];
		}
		else if(arr[i]<smallest)
		{
			smallest=arr[i];
		}
	}
	System.out.println("largest is "+large);
	System.out.println("smallest is "+smallest);
}
}
