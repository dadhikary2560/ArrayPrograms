package com.Array;


//Rotate array to the left by one position.
public class RotateBy1PositionToLeft {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			break;
		}
	}
	System.out.println(java.util.Arrays.toString(arr));
}
}
