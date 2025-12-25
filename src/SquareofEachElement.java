
public class SquareofEachElement {
public static void main(String[] args) {
	int arr[]= {5,2,3,4};
	for(int i=0;i<arr.length;i++)
	{
		int squareNum=0;
		squareNum=(int) Math.pow(arr[i], 2);
		System.out.println(squareNum);
		
	}
}
}
