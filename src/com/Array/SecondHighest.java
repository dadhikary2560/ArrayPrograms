package com.Array;


//Find the second largest element in an array.
public class SecondHighest {
public static void main(String[] args) {
	int arr[]= {5,6,8,4,2,10,7};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
	}
	System.out.println(java.util.Arrays.toString(arr));
	System.out.println(arr[arr.length-2]);
}
}
