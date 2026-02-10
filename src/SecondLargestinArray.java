
public class SecondLargestinArray {
public static void main(String[] args) {
	int arr[]= {5,4,8,6,2,7,1};
	//System.out.println(arr.length);
	
	int large1=0;
	int large2=0;
	for(int i=0;i<arr.length/2;i++)
	{
		if(large1<arr[i])
			large1=arr[i];
	}
	for(int i=(arr.length/2)+1;i<arr.length;i++)
	{
		if(large2<arr[i])
			large2=arr[i];
	}
	if(large1<large2)
	{
		large1=large1+large2;
		large2=large1-large2;
		large1=large1-large2;
	}
	System.out.println("largest is"+large1);
	System.out.println("second largest is "+large2);
}
}
