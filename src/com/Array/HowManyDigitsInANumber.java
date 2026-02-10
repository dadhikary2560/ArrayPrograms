package com.Array;


//how many digits are there in one element
public class HowManyDigitsInANumber {
public static void main(String[] args) {
	int arr[]= {153,1234,370};
	
	for(int i=0;i<arr.length;i++)
	{
		int counter=0;
		int n=arr[i];
		while(n!=0)
		{
			n=n/10;
			counter++;
		}
		System.out.println("for "+arr[i]+" counter value is "+counter);
	}
}
}
