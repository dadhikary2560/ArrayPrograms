package com.Array;


////Reverse the array with using another array.
public class ReverseArrayWithoutUsingAnotherArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int end=arr.length-1;
	int start=0;
		while(start<end)
		{
			arr[start]=arr[start]+arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
			end--; start++;
		}
	
	System.out.println(java.util.Arrays.toString(arr));
}
}
