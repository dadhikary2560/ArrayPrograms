package com.Array2;


//8. Print elements appearing exactly once
public class ElementsAppearOnce {
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 2, 4, 1, 5};
				
		
		for(int i=0;i<arr.length;i++)
		{
			
			//---------------------------------------------------
			boolean numberFoundEarly=false;

			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i])
				{
					numberFoundEarly=true;
					break;
				}
			}
			
			if(numberFoundEarly)
				continue;
			//----------------------------------------------------
			/*the above part is required to check if number has appeared before
			 * as once appeared it should not be part of the next j loop
			 * for e.g. 1 is already checked, so for it's next appearance
			 * it should not be considered and be skipped
			 */
			
			int counter=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					counter++;
			}
		if(counter==0)
			System.out.println("unique element, no duplicates for "+arr[i]);
		}
	}

}
