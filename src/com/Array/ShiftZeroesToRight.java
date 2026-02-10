package com.Array;

public class ShiftZeroesToRight {
public static void main(String[] args) {
	int arr[]= {0,1,2,0,4,0,5};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==0)
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]+arr[j];
			}
		}
	}
	System.out.println(java.util.Arrays.toString(arr));
			
}
}
