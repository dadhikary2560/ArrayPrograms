package com.Array;


//Find the smallest element in an array.
public class SmallestInArray {
public static void main(String[] args) {
	int arr[]= {-15,5,1,2,-30,15,-5,-20};
	int smallest=arr[0]; 					//taking arr[0] value as the smallest in the array
	for(int i=0;i<arr.length;i++)
	{
		if(smallest>arr[i])
			smallest=arr[i];
	}
	System.out.println("the smallest number in the array "+smallest);
}
}
