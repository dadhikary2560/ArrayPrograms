package com.Matrix;

import java.util.Arrays;

//matrix addition is only possible when both matrix has equal rows and columns
public class MatrixAddition {
	
	//Matrix subtraction
	private int[][] m1(int array1[][], int array2[][]) {
		int arr3[][]=new int[array1.length][array1.length];
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[i].length;j++)
			{
				arr3[i][j]=array2[i][j]-array1[i][j];
			}
		}
		return arr3;
	}
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int arr2[][]= {{10,20,30},{40,50,60},{70,80,90}};
	MatrixAddition obj=new MatrixAddition();
	System.out.println("Matrix Substraction value is: ");
	System.out.println(Arrays.deepToString(obj.m1(arr,arr2)));
	
	
	System.out.println("Matrix Addition value is: ");
	int maxLength=0;
	if(arr.length>arr2.length)
		maxLength=arr.length;
	else
		maxLength=arr2.length;
	int arr3[][]=new int[maxLength][maxLength];
	for(int i=0;i<maxLength;i++)
	{
		for(int j=0;j<maxLength;j++)
		{
			arr3[i][j]=arr[i][j]+arr2[i][j];
		}
	}
	System.out.println(Arrays.deepToString(arr3));
}
}
