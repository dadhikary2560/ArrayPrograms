
public class SecondLargestInArrayDifferentApproach {
public static void main(String[] args) {
	int arr[]= {5,4,8,6,2,7,1,9};
	int largest=0;
	int secondLargest=0;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			secondLargest=largest;
			largest=arr[i];
		}
	}
	System.out.println("largest number is: "+largest);
	System.out.println("second largest number is: "+secondLargest);
}
}
