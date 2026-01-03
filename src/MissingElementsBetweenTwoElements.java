public class MissingElementsBetweenTwoElements {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,7,9,10,15};
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		if(arr[i]+1==arr[j])
		{
			break;
		}
		else
		{
			arr[i]=arr[i]+1;
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
}
