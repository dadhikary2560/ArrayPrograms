package com.Array;


//Remove duplicate elements from an array.
public class RemoveDuplicate {
public static void main(String[] args) {
	int arr[]={1,2,3,1,4,2,5};
	
	for(int i=0;i<arr.length;i++)
	{
		boolean checkNumber=false;
		for(int k=0;k<i;k++)
		{
			if(arr[k]==arr[i])
			{
				checkNumber=true;
				break;
			}
		}	
		if(checkNumber)
			continue;
		int counter=0;
		
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
				counter++;
			if(counter==1)
				break;
			
		}
		
		if(counter==1)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
	
}
