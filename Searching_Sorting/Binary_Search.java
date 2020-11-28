package Searching_Sorting;
import java.util.*;
public class Binary_Search {

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
		
		SortArray(arr);
		int pos = BinarySearch(arr,a);
		
		System.out.println(pos);
		
		sc.close();
	}
	
	public static void SortArray(int[] arr) {
		
	}
	public static int BinarySearch(int[] arr, int a) {
			int low = 0, high = arr.length-1;
			
			while(low<=high)
			{
				int mid = (low+high)/2;
				
				if(arr[mid] < a)
				{
					low = mid+1;
				}
				else if(arr[mid] > a)
				{
					high = mid-1;
				}
				else
				{
					return mid;
				}
			}
			
			return -1;
			
		}
	

}
