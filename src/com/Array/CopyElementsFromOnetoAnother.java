package com.Array;


//Copy elements from one array to another.
public class CopyElementsFromOnetoAnother {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,8};
	int arr2[]=new int[arr.length];
	int index=0;
	
	
	for(int i=0;i<arr.length;i++)
	{
		arr2[index]=arr[i];		//as i works for arr
		index++;				//index works for arr2, and we need to 
	}							//manually increase value of index
	System.out.println(java.util.Arrays.toString(arr2));
}
}
