package com.Array;


//Rotate array to the right by one position.
public class RotateBy1PositionToRight {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int last=arr[arr.length-1];
	//consider last position is empty
	
	//starting from last position as it is empty now To 1 position
	for(int i=arr.length-1;i>0;i--)
	{
		arr[i]=arr[i-1];
	}
	
	//for 0 position
	arr[0]=last;
	System.out.println(java.util.Arrays.toString(arr));
}
}
