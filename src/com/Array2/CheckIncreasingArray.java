package com.Array2;




//Program to check if an array is has increasing elements
public class CheckIncreasingArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	boolean increase=true;
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[i])
				increase=false;
		}
	}
	System.out.println("value received at increament is: "+increase);
	if(increase==true)
	{
		System.out.println("the array is strictly increasing");
	}
}
}
