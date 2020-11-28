package Searching_Sorting;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements :");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Number to Search : ");
		int a = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i]==a)
			{
				System.out.println("Found at position = "+i);
				break;
			}
			else 
			{
				if(i==arr.length-1)
				{
					System.out.println("Not Found");
				}
				else
				{
					continue;
				}
			}
		}
		sc.close();
	}

}
