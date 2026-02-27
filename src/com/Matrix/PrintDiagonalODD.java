package com.Matrix;

public class PrintDiagonalODD {
	private void m1(int arr[][]) {
		for (int j = 0; j < arr[0].length; j++) {
			if(j%2!=0)
				continue;
			for (int i = 0; i < arr.length; i++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[][] = { { -10, 1, 2, 13, 4 }, { 5, -20, 8, 4 }, { 5, 8, 12, 3, 5}, { 88, 74, 69, 70, 50}, { 5, 88, 91, 99, 55 } };
		PrintDiagonalODD obj=new PrintDiagonalODD();
		obj.m1(arr);
	}
}
