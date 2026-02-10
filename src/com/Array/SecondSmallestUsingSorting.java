package com.Array;


//Find the second smallest element in an array.
public class SecondSmallestUsingSorting {
public static void main(String[] args) {
	int arr[]= {8,5,6,4,-40,2,10,7};
	
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
	System.out.println("second smallest number is: "+arr[1]);
}
}
