package com.Array2;





//2. Check if array is strictly increasing, decreasing, or neither
public class StrictlyIncreasingOrDecreasingOrNot {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	boolean increase=true;
	boolean decrease=true;
	
	
	for(int i=0;i<arr.length-1;i++)
	{
			if(arr[i+1]<arr[i])		//if added <= program is 100% full proof
				increase=false;
			else
				decrease=false;
	}
	System.out.println("value received at increament is: "+increase);
	System.out.println("value received at decreament is: "+decrease);
	if(increase==true)
	{
		System.out.println("the array is strictly increasing");
	}
	else if(decrease==true)
	{
		System.out.println("the array is strictly decreasing");
	}
	else
		System.out.println("The array is neither strictly increasing nor decreasing");
}
}
