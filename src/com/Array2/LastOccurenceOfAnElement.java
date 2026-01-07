package com.Array2;


//4. Find the last occurrence of a given number
public class LastOccurenceOfAnElement {
public static void main(String[] args) {
	int arr[]= {2, 4, 6, 4, 8, 4, 10, 4};
	int first=0, second=0, last=0;
	boolean numCheck=false;
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				first=second;
				second=last;
				last=j;
				numCheck=true;
			}
		}
		if(numCheck==true)
		{
			System.out.println("found "+arr[i]+" and last occurence is: "+last);
			System.out.println("and second occurence is: "+second);
			System.out.println("and first occurence is: "+first);
			break;
		}
	}
}
}
