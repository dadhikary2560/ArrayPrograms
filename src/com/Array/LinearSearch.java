package com.Array;
import java.util.*;



//Search an element using linear search.
public class LinearSearch {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your desired number");
			int num=sc.nextInt();
			
			int arr[]= {5,6,7,8,1,2,4,3,9,15,14,22};
			for(int i=0;i<arr.length;i++)
			{
				if(num==arr[i])
				{
					System.out.println("we have found the desired number: "+num+" at "+i+"th position");
					break;
				}
			}
		}
	}

}
