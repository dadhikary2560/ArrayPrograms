package com.Array;


//Count the number of even and odd elements in an array.
public class CountEvenOddInArray {
public static void main(String[] args) {
	int arr[]= {5,7,8,9,1,2,3,45,44,6};
	int oddCounter=0;
	int evenCounter=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			evenCounter++;
		else
			oddCounter++;
	}
	System.out.println("counter for odd elements: "+oddCounter);
	System.out.println("counter for even elements "+evenCounter);
}
}
