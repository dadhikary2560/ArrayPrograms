package com.Array;


//Count frequency of each element in an array.
//which means to check how many times a number has appeared in the array
public class DuplicateCount {
public static void main(String[] args) {
	int arr[]= {2,8,2,8,1,2};
	
	for(int i=0;i<arr.length;i++)
	{
		int counter=0;
		
		
		/*the below section is just to check whether we have found the number 
		before or not, if yes it will break, else it will continue from the
		if statement*/
		
		
		//----------------------------------------------------
		boolean numberMilaHei=false;
		for(int k=0;k<i;k++)
		{
			if(arr[k]==arr[i])
			{
				numberMilaHei=true;
				break;
			}
		}	
		if(numberMilaHei)
		{
			continue;
		}
		//----------------------------------------------------
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				counter++;
			}
		}
		if(counter>0)
		System.out.println("the number: "+arr[i]+" has apeeared "+counter+" times");
	}
}
}
