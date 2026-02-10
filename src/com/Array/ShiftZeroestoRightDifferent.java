package com.Array;

public class ShiftZeroestoRightDifferent {
public static void main(String[] args) {
	int arr[]= {0,1,2,0,5,7,0,9};
	int index=0;
	
	
	//working for values which are not equal to 0
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			arr[index]=arr[i];
			index++;
		}
	}
	
	//to fill up remaining positions with 0s
	while(index!=arr.length)
	{
		arr[index]=0;
		index++;
	}
	System.out.println(java.util.Arrays.toString(arr));
}
}
