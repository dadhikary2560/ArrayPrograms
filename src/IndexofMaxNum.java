
public class IndexofMaxNum {
public static void main(String[] args) {
	int arr[]= {8,5,6,7,4,1,2,0};
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>arr[max])
		{
			max=i;
		}
	}
	System.out.println("max index is "+max);
	System.out.println("max index has the value "+arr[max]);
}
}
