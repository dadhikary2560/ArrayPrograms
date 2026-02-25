package com.Matrix;

//Find sum of all elements

public class Matrix0003 {
	private void m1(int arr[][]) {
		// adding array wise
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("sum of the " + i + " th array is" + sum);
		}
	}

	private void m2(int arr[][]) {
		// Find maximum and minimum element
		int max = arr[0][0];
		int min = max;
		System.out.println("value of max is: " + max);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				else if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		System.out.println("max value is: "+max+" and min value is: "+min);
	}

	public static void main(String[] args) {
		int arr[][] = { { -10,1, 2, 13, 4 }, { 5, -20, 8, 4 } };
		Matrix0003 obj = new Matrix0003();
		obj.m1(arr);
		obj.m2(arr);
	}
}
