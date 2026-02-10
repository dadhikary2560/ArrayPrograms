package com.Array;

public class shiftZerosToLeft {
public static void main(String[] args) {
	int arr[]= {0,1,2,0,5,7,0,9};
	int index=arr.length-1;
	
	//start from end
	for(int i=arr.length-1;i>0;i--)
	{
		if(arr[i]!=0)
		{
			arr[index]=arr[i];
			index--;
		}
	}
	while(index>0)
	{
		arr[index]=0;
		index--;
	}
	System.out.println(java.util.Arrays.toString(arr));
}
}
