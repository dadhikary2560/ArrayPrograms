
public class SortDescending {
public static void main(String[] args) {
	int arr[]= {1,6,3,2,-20,7,4,5};
	
	for(int i=0;i<arr.length;)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int x=arr[j];
				arr[j]=arr[i];
				arr[i]=x;
			}
		}
		i++;
	}
	System.out.println(java.util.Arrays.toString(arr));
}
}
