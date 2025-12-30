package com.Array;


//Count positive, negative, and zero elements in an array.
public class CountPositiveNegativeZeroElements {
public static void main(String[] args) {
	int arr[]= {5,4,3,2,-10,-20,-5,4,-8,0};
	int positive = 0,negative = 0,zero=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
			positive++;
		else if(arr[i]<0)
			negative++;
		else
			zero++;
	}
	System.out.println("counter for positive number: "+positive);
	System.out.println("counter for negative numbers: "+negative);
	System.out.println("counter for zero elements: "+zero);
}
}
