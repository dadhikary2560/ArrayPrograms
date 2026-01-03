package com.Array;


//Find the missing elements in a sorted array.
public class MissingElements {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,7,8,12,13,14,20,24};
	for(int i=0;i<arr.length-1;i++)
	{
		int start=arr[i];
		int second=arr[i+1];
		
		for(int num=start+1;num<second;num++)
		{
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
}
