package com.Array2;



//Program to check if an array is has decreasing elements
public class CheckDecreasingArray {
public static void main(String[] args) {
	int arr[]= {9,5,4,3,2,1};
	boolean decrease=true;
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]>arr[i])
				decrease=false;
		}
	}
	System.out.println("value received at decreament is: "+decrease);
	if(decrease==true)
	{
		System.out.println("the array is strictly decreasing");
	}
}
}
