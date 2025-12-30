
package com.Array;
import java.util.*;
//Write a Java program to read and print elements of an integer array.
public class ReadAndPrintArrayElements {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter size of the array");
		int arr[]=new int[sc.nextInt()];
		
		System.out.println("enter elements for the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
}
