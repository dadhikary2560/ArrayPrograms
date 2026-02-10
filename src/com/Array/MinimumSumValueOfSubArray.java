package com.Array;

public class MinimumSumValueOfSubArray {
public static void main(String[] args) {
	int arr[][] = {{2,3,5,99},{15,24,18,8},{7,9,88,2},{1,2,3,4}}; //{109,65,106}
	int tempSum=0;
	int oldSum=0;
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=0;j<arr[i].length;j++)
		{
			sum=sum+arr[i][j];
		}
		oldSum=tempSum;
		tempSum=sum;
	}
	if(tempSum>oldSum)
		System.out.println(oldSum);
	else
		System.out.println(tempSum);

}
}
