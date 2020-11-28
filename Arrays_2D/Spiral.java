package Arrays_2D;
import java.util.*;
public class Spiral {

	public static void main(String[] args) {
		int[][] arr = takeInput();
		spiral(arr);
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
	public static void spiral(int[][] arr) {
		
	}
}
