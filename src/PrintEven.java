
public class PrintEven {
public static void main(String[] args) {
	int arr[]= {4,5,6,9,12};
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.println("the number "+arr[i]+" is even");
		}
		else
		{
			System.out.println("the number "+arr[i]+" is NOT even");
		}
	}
}
}
