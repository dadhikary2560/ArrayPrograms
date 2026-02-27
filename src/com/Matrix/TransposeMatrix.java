package com.Matrix;

import java.util.Arrays;

public class TransposeMatrix {
	public static void main(String[] args) {
		int arr[][] = { { -10, 1, 2, 13 }, { 5, -20, 8, 4 }, { 5, 8, 12, 3 }, { 47, 58, 31, 21 } };
		int arr2[][] = new int[arr.length][arr.length];
		System.out.println(arr2.length);

		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j] + "  ");
				arr2[j][i] = arr[i][j];
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr2));
	}
}
