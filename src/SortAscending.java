
public class SortAscending {
public static void main(String[] args) {
	int arr[]= {7,5,4,3,5,-20,2,1,6};	//declaring the array
	for(int i=0;i<arr.length;i++)	//array goes from 0 to arr.length position
	{
		for(int j=i+1;j<arr.length;j++) //array goes from 0+1 to arr.length position
		{
			if(arr[i]>arr[j])	//comparing if arr[0]>arr[1]	5>4 ?
			{
				int x=arr[j];	//if yes x=4
				arr[j]=arr[i];	//arr[1] = 5
				arr[i]=x;		//arr[0] = 4
			}
		}
	}
	System.out.println(java.util.Arrays.toString(arr));	//prints the whole array
}
}
