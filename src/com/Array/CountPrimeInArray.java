package com.Array;

public class CountPrimeInArray {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,1,37};
	int counter=0;
	
	for(int i=0;i<arr.length;i++)
	{
		int flag=0;
		if(arr[i]<=1)
			continue;
		for(int n=2;n<arr[i];n++)
		{
			if(arr[i]%n==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			counter++;
			System.out.println("prime numbers are "+arr[i]);
		}
	}
	System.out.println("prime numbers counter reached: "+counter);
}
}
