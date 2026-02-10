
public class MaxSumofSubarray {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{2,3,4},{4,5,6},{10,5},{2,3}};
	int arr2[]=null;	//creating an empty array
	int newSum=0;		//empty variable
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=0;j<arr[i].length;j++)
		{
			sum=sum+arr[i][j];
		}
		if(newSum<=sum)
		{
			newSum=sum;
			arr2=arr[i];//sub array is being stored in arr2
			//System.out.println(java.util.Arrays.toString(arr2));
		}
	}
	System.out.println(java.util.Arrays.toString(arr2)+"and sum value is "+newSum);
}
}
