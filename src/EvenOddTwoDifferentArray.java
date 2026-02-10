
public class EvenOddTwoDifferentArray {
public static void main(String[] args) {
	int x[]= {1,2,3,5,7};  //x={2,4,6,8,10}
	int y[]= {4,5,6,8,10}; //y={1,3,5,7,5}
	
	int arr[]=new int[x.length+y.length];
	int index=0;
	
	//to insert x into arr
	for(int i=0;i<x.length;i++)
	{
		arr[index]=x[i];
		index++;
	}
	
	//to insert y into arr
	for(int i=0;i<y.length;i++)
	{
		arr[index]=y[i];
		index++;
	}
	System.out.println(java.util.Arrays.toString(arr));
	
	//to check even and odd numbers
	int even[]=new int[arr.length/2];
	int odd[]=new int[arr.length/2];
	int even_index=0;
	int odd_index=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even[even_index]=arr[i];
			even_index++;
		}
		else
		{
			odd[odd_index]=arr[i];
			odd_index++;
		}
		
	}
	System.out.println(java.util.Arrays.toString(even));
	System.out.println(java.util.Arrays.toString(odd));
}
}
