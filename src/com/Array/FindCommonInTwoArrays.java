package com.Array;


//Find common elements between two arrays.
public class FindCommonInTwoArrays {
public static void main(String[] args) {
	int arr[]= {1,22,99,6,77};
	int arr2[]= {5,8,77,10,22,8,99};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			if(arr[i]==arr2[j])
			{
				System.out.println("It is a match in two arrays: "+arr[i]);
				System.out.println("found in i position "+i+" & in j position "+j);
			}
		}
	}
}
}
