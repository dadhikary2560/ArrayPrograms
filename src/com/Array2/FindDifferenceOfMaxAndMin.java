package com.Array2;


//7. Find difference between max and min without sorting
public class FindDifferenceOfMaxAndMin {
public static void main(String[] args) {
	int arr[]= {10,7, 2, 1,9, 4, 2,11};
	int max=arr[0];
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
			max=arr[i];
		else if(min>arr[i])
			min=arr[i];
		//System.out.println("max: "+max+" & min: "+min);
	}
	System.out.println("difference between max and min "+(max-min));
	System.out.println("for max: "+max+" & min: "+min);
}
}
