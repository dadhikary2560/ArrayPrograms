package com.Matrix;

//Find sum of each column
public class SumColumn {
	private void m1(int arr[][]) {
		for (int j = 0; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (j < arr[i].length) {
					sum = sum + arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.print("and their sum is: " + sum);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[][] = { { -10, 1, 2, 13, 4}, { 5, -20, 8, 4 } };
		SumColumn obj = new SumColumn();
		obj.m1(arr);
	}
}
