package Searching_Sorting;
import java.util.*;
public class Selection_Sort {

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
		SelectionSort(arr);
		for(int val : arr)
		{
			System.out.println(val);
		}
		sc.close();
	}
	
	public static void SelectionSort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++)
		{
			int min = i;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
		}
	}
}