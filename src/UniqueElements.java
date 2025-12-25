
public class UniqueElements {
public static void main(String[] args) {
	 int arr[] = {4,5,6,4,9,4,2,5,10,2,4,5};
	 for(int i=0;i<arr.length;i++)
	 {
		 int counter=0;
		 
		 /* the below section under the comment lines
		  * is to check whether the number has appeared before
		  * so for array index value 5 for i, it checks from 0 to 5 for k, and 
		  * finds duplicate
		  * if duplicate's found numberPehleMilaHei becomes true, and then breaks
		  * 
		  * the following if condition
		  * if(numberPehleMilaHei)
		  * checks if numberPehleMilaHei is true, if yes, it continues to next i value
		  */
		 
		 //so basically piche ka number check karne k liye 
		 //====================================================//
		 boolean numberPehleMilaHei=false;
		 for(int k=0;k<i;k++)
		 {
			 if(arr[k]==arr[i])
			 {
				 numberPehleMilaHei=true;
				 break;
			 }
		 }
		 if(numberPehleMilaHei)
		 {
			 continue;
		 }
		//====================================================//	 
			 
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]==arr[j])
			 {
				 counter++;
			 }
		 }
		 if(counter==0)
		 {
			 System.out.println("unique element is "+arr[i]);
		 }
	 }
}
}
