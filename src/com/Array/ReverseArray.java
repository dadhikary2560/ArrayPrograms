package com.Array;


//Reverse the array with using another array.
public class ReverseArray {
public static void main(String[] args) {
	int index=0;
	int arr[]= {1,2,3,4}; 
	int temp[]=new int[arr.length];
	for(int i=arr.length-1;i>=0;i--)
	{
		
			temp[index]=arr[i];
			index++;
		
	}
	System.out.println(java.util.Arrays.toString(temp));
}
}
