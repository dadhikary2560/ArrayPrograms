package com.Array;

public class ArmstrongNumberInArray {
public static void main(String[] args) {
	int arr[]= {153,1234,370};
	
	for(int i=0;i<arr.length;i++)
	{
		int counter=0;
		int remainder=0;
		int n=arr[i];
		int arr2[]=new int[5];
		int index=0;
		while(n!=0)
		{
			remainder=n%10;
			n=n/10;
			counter++;
			arr2[index]=remainder;
			index++;
		}
		int sum=0;
		for(int j=0;j<arr2.length;j++)
		{
			sum += Math.pow(arr2[j], counter);
		}
		if(sum==arr[i])
			System.out.println("Armstrong number is "+arr[i]);
	}
}
}
