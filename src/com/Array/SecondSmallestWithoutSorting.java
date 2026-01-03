package com.Array;


//Find the second smallest element in an array.
public class SecondSmallestWithoutSorting {
	public static void main(String[] args) {
		int arr[]= {8,5,6,4,-40,2,10,7};
		int smallest=arr[0];
		int secondSmallest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(secondSmallest>arr[i] && secondSmallest!=smallest)
			{
				secondSmallest=arr[i];
			}
				
		}
		System.out.println("second Smallest number is "+secondSmallest);
	}

}
