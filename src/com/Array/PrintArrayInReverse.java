package com.Array;


//Print array elements in reverse order.
public class PrintArrayInReverse {
public static void main(String[] args) {
	int arr[]= {5,4,3,6,2,1};
	
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
}
