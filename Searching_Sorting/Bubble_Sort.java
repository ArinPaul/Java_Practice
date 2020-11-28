package Searching_Sorting;
import java.util.*;
public class Bubble_Sort {

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
		BubbleSort(arr);
		for(int val : arr)
		{
			System.out.println(val);
		}
		sc.close();
	}
	
	public static void BubbleSort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++)
		{
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= tmp;
				}
			}
		}
	}

}
