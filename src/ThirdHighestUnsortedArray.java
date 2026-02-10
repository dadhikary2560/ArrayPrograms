
public class ThirdHighestUnsortedArray {
public static void main(String[] args) {
	int max=0;
	int secondMax=0;
	int thirdMax=0;
	int fourthMax=0;
	int arr[]= {7,1,4,8,5,9,6};
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			fourthMax=thirdMax;
			thirdMax=secondMax;
			secondMax=max;
			max=arr[i];
		}
		else if(secondMax<arr[i] && secondMax!=max)
		{
			fourthMax=thirdMax;
			thirdMax=secondMax;
			secondMax=arr[i];
		}
		else if(thirdMax<arr[i] && thirdMax!=secondMax)
		{
			fourthMax=thirdMax;
			thirdMax=arr[i];
		}
		else if(fourthMax<arr[i] && fourthMax!=thirdMax)
			fourthMax=arr[i];
	}
	System.out.println("max value is"+max);
	System.out.println("Second max value is"+secondMax);
	System.out.println("Third max value is"+thirdMax);
	System.out.println("fourth max value is"+fourthMax);
}
}
