
public class SumOfSubArrayElements {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{2,3,4},{4,5,6},{10,5}};
	
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=0;j<arr[i].length;j++)
		{
			sum=sum+arr[i][j];
		}
		 System.out.println(java.util.Arrays.toString(arr[i]));
		 
		 //java.util.Arrays.toString  it returns the array itself not the
		 //string representation of the array object
		 
		System.out.println("sum of all elements of subarray is "+sum);
	}
}
}

