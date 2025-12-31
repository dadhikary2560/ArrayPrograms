package com.Array;


//Print duplicate elements in an array.
public class DuplicateNumbers {
public static void main(String[] args) {
	int arr[]= {1,2,3,2,4,3};
	
	for(int i=0;i<arr.length;i++)
	{
		int counter=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				counter=counter+1;
			}
		}
		if(counter>0)
			System.out.println("we have duplicate for the element: "+arr[i]);
	}
	
}
}
