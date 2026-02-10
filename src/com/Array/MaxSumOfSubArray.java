package com.Array;



public class MaxSumOfSubArray {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{2,3,4},{4,5,6},{10,5}};
	int max=0;
	int k=0;
	
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=0;j<arr[i].length;j++)
		{
			sum=sum+arr[i][j];
		}
		if(max<sum)
		{
			max=sum;
			//System.out.println("value of: "+i);
			k=i;
		}
	}
	System.out.println(java.util.Arrays.toString(arr[k]));
}
}

