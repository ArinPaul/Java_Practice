package Searching_Sorting;
import java.util.*;
public class Upper_Lower_Bound {

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
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		
		lowerBound(arr,data);
		upperBound(arr,data);
		
		sc.close();
	}
	
	public static void lowerBound(int[] arr, int data)
	{
		int low = 0, high = arr.length-1;
		int ans = -1;
		
		while(low <= high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == data)
			{
				ans = mid;
				high = mid - 1;
			}
			else if(arr[mid] > data)
			{
				high = mid -1;
			}
			else if(arr[mid] < data)
			{
				low = mid + 1;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void upperBound(int[] arr, int data)
	{
		int low = 0, high = arr.length-1;
		int ans = -1;
		
		while(low <= high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == data)
			{
				ans = mid;
				low = mid + 1;
			}
			else if(arr[mid] > data)
			{
				high = mid -1;
			}
			else if(arr[mid] < data)
			{
				low = mid + 1;
			}
		}
		
		System.out.println(ans);
	}
}
