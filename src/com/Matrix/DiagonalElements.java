package com.Matrix;

public class DiagonalElements {

	private void m1(int arr[][]) {
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");

	}
	
	//sum of diagonal elements
	private void m2(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i][i];
			System.out.println(arr[i][i]);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("sum of all diagonal elements: "+sum);
	}

	public static void main(String[] args) {
		int arr[][] = { { -10, 1, 2, 13 }, { 5, -20, 8, 4 }, { 5, 8, 9, 10 }, { 8, 15, 17, 90 } };
		DiagonalElements obj = new DiagonalElements();
		obj.m1(arr);
		obj.m2(arr);
	}
}
