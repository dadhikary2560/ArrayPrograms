import java.util.*;
public class findMatchIndex {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int a=sc.nextInt();
		
		int arr[]= {5,8,7,9,1,2,10};
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				System.out.println("there is a match in the array at "+i+" index value");
			}
			
		}
	}
}
}
