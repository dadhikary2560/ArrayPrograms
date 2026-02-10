package com.Array;


//Print palindrome numbers from an array.
public class CheckpalindromeInArray {
public static void main(String[] args) {
	int arr[]= {121,23,16161,40,-414};
	int index=0;
	for(int i=0;i<arr.length;i++)
	{
		int remainder=0;
		int reverse=0;
		int num=arr[i];
		while(num!=0)
		{
			remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
		}
		if(reverse==arr[i])
		{
			arr[index]=arr[i];
			index++;
		}
	}
	while(index<arr.length)
	{
		arr[index]=0;
		index++;
	}
	System.out.println(java.util.Arrays.toString(arr));
}
}
