package com.Matrix;

import java.util.Arrays;

//Print a matrix row-wise | Print a matrix column-wise
public class Matrix0002 {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{8,9,10}};
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("elements from the "+i+" array are");
		System.out.println(Arrays.toString(arr[i]));
	}
	
	//to print column wise
	for(int j=0;j<arr[0].length;j++)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
