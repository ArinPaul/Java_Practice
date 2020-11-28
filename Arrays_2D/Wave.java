package Arrays_2D;
import java.util.*;
public class Wave {

	public static void main(String[] args) {
		int[][] arr = takeInput();
		wavePrintRow(arr);
	}
	public static int[][] takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows :");
		int row = sc.nextInt();
		int[][] arr = new int[row][];
		for(int i=0; i<row; i++)
		{
			System.out.println("Enter Columns :");
			int col = sc.nextInt();
			arr[i] = new int[col];
			System.out.println("Enter Value for "+i+" row");
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
	public static void wavePrintRow(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j=arr[i].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
}
