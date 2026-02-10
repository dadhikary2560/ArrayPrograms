package com.Array;



////Find the second largest element in an array.
public class SecondHighestDifferent {
public static void main(String[] args) {
	int arr[]= {8,5,6,4,2,10,7};
	int max=0;
	int secondMax=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			secondMax=max;
			max=arr[i];
		}
		else if(secondMax<arr[i] && secondMax!=max)
		{
			secondMax=arr[i];
		}
	}
	System.out.println(max);
	System.out.println(secondMax);
}
}
