package com.Matrix;

import java.util.Arrays;

public class MatrixTest0002 {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{8,9,10}};
	
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		System.out.println(Arrays.toString(arr[i]));
		for(int j=0;j<arr[i].length;j++)
		{
			sum=sum+arr[i][j];
		}
		System.out.println("sum of the first array in the 2d array is: "+sum);
	}
}
}
