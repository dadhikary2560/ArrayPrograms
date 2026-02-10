package com.Array;


//Print unique elements in an array.
public class UniqueElements {
public static void main(String[] args) {
	int arr[]= {1,2,3,1,4,2};
	
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
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				counter++;
			}
		}
		if(counter==0)
		{
			System.out.println("unique number is: "+arr[i]);
		}
	}
				
}
}
	
	

