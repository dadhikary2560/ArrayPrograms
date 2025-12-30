package com.Array;



//Find the average of array elements.
public class AverageOfElements {
public static void main(String[] args) {
	int arr[]= {5,4,3,8,6,1};
	int sum=0, average=0;
	for(int i=0;i<arr.length;i++)
		sum=sum+arr[i];
	average=sum/2;
	System.out.println(average);
}
}
