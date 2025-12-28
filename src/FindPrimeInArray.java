
public class FindPrimeInArray {
public static void main(String[] args) {
	int arr[]= {8,5,6,7,4,1,2,3};
	
	for(int i=0;i<arr.length;i++)
	{
		int flag=0;
		if(arr[i]<=1)
			continue;
		
		
		for(int n=2;n<arr[i];n++)
		{
			if(arr[i]%n==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("prime Number is"+arr[i]);
		}
	}
}
}
