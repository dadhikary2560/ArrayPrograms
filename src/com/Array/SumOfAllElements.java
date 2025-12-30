package com.Array;


//Find the sum of all elements in an array.


public class SumOfAllElements {
public static void main(String[] args) {
	int arr[]= {5,4,3,2,5};
	int sum=0;
	
	for(int i=0;i<arr.length;i++)
		sum=sum+arr[i];
	System.out.println("sum of all elements "+sum);
}
}
