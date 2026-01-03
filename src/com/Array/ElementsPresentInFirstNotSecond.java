package com.Array;


//Find elements present in first array but not in second.
public class ElementsPresentInFirstNotSecond {
public static void main(String[] args) {
	int arr[]= {1,2,3,22,5,-40};
	int arr2[]= {3,2,1,6,7};
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
		for(int j=0;j<arr2.length;j++)
		{
			if(arr[i]==arr2[j])
			{
				counter++;
			}
		}
		if(counter==0)
		{
			System.out.print(arr[i]+" ");
		}
	}	
}
}
