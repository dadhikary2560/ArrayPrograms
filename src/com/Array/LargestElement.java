package com.Array;




//Find the largest element in an array.
public class LargestElement {
public static void main(String[] args) {
	int large=0;
	int arr[]= {5,4,3,10,15,8,-20};
	
	for(int i=0;i<arr.length;i++)
	{
		if(large<arr[i])
		{
			large=arr[i];
		}
	}
	System.out.println("largest inside the array "+large);
}
}
