package com.Array2;



//6. Check if array can be sorted by one swap
public class SortInOneSwap {
public static void main(String[] args) {
	int arr[]= {1,3,2,7,5,6};
	int jPosition=0;
	
	for(int i=0;i<arr.length;i++)
	{
		int counter=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				jPosition=j;
				counter++;
			}
		}
		if(counter>1)
		{
			break;
		}
		if(counter==1)
		{
			System.out.println("array can be sorted in one swap");
			System.out.println("swapping shold be at "+i+" and "+jPosition+" position");
		}
		
	}
	
}
}
