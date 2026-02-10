package com.Array;


//Check whether an array is sorted in ascending order.
public class ArrayInAscendingOrNot {
public static void main(String[] args) {
	int arr[]= {8,5,6,4,-40,2,10,7}; //works for {1,2,3,4}, for sorted array
	int flag=0;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				flag=1;
				break;
			}
			else
				flag=0;
		}
	}
	if(flag==0)
	System.out.println("array is sorted in ascending order");
}
}
