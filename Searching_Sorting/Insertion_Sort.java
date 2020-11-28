package Searching_Sorting;
import java.util.*;
public class Insertion_Sort {

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
		InsertionSort(arr);
		for(int val : arr)
		{
			System.out.println(val);
		}
		sc.close();
	}
	
	public static void InsertionSort(int[] arr) {
		for(int i = 1;i<arr.length;i++)
		{
			int val = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > val)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
		}
	}
		
}