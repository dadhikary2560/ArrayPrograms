package com.Array2;



//9. Rotate array right by 1 (no extra array)
public class RotateArrayByOnePositionToRight {
	static void myMethod() 
	{
		int arr[]= {1,2,3,4,5};
		int last=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		System.out.println(java.util.Arrays.toString(arr));
	}
	public static void main(String[] args) {
		RotateArrayByOnePositionToRight.myMethod();
		
	}
}
