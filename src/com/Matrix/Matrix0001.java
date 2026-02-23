package com.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix0001 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3]; // means 3 arrays each containing 3 elements
		System.out.println("enter values for matrix");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println(Arrays.toString(arr[i]));	//prints a single array from 2d-array
			System.out.println();
		}
		sc.close();
	}
}
