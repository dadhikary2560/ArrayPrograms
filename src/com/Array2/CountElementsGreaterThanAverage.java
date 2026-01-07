package com.Array2;



//1. Count elements greater than the average of the array
public class CountElementsGreaterThanAverage {
public static void main(String[] args) {
	int arr[]= {4,5,1,2,40,3,7};
	int sum=0;
	int average=0;
	for(int i=0;i<arr.length;i++)
		sum=sum+arr[i];
	average=sum/arr.length;
	int counter=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>average)
		{
			counter++;
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println("counter has reached: "+counter);
	System.out.println("average of all elements: "+average);
}
}
