package com.Array2;




//3. Find the first repeating element
public class FindTheFirstRepeating {
public static void main(String[] args) {
	int arr[]= {10, 5, 3, 4, 3, 5, 6};
	boolean numFound=false;
	for(int i=0;i<arr.length;i++)
	{
		int position=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				numFound=true;
				position=j;
				break;
			}
		}
		
		
		//the below section is required so that the loop for "i"
		//ends when i repeating number is found
		if(numFound==true)
		{
			System.out.println("the first repeating element is "+arr[i]+" at position "+position);
			break;
		}
	}
}
}
