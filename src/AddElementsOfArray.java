import java.util.Scanner;
public class AddElementsOfArray {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("define size of array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			int sumOfArray=0;
			
			
			//to read and to add elements
			for(int i=0;i<n;i++)
			{
				System.out.println("enter element");
				arr[i]=sc.nextInt();
				sumOfArray=sumOfArray+arr[i];
				System.out.println("sum of arrey when i= "+i+" is: "+sumOfArray);
			}
			System.out.println("sum of array is: "+sumOfArray);
		}
	}

}
