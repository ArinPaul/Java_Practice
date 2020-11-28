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
		int top = 0, bottom = arr.length-1, left = 0, right = arr[top].length-1;
		int count = (bottom+1)*(right+1), dir = 1;
		
		while(left <= right && top <= bottom)
		{
			if(count > 0)
			{
				if(dir == 1)
				{
					for(int i=left;i<=right;i++)
					{
						System.out.print(arr[top][i]+" ");
						count--;
					}
					top++;
					dir = 2;
				}				
			}
			if(count > 0)
			{
				if(dir == 2)
				{
					for(int i=top;i<=bottom;i++)
					{
						System.out.print(arr[i][right]+" ");
						count--;
					}
					right--;
					dir = 3;
				}				
			}
			if(count > 0)
			{
				if(dir == 3)
				{
					for(int i=right;i>=left;i--)
					{
						System.out.print(arr[bottom][i]+" ");
						count--;
					}
					bottom--;
					dir = 4;
				}				
			}
			if(count > 0)
			{
				if(dir == 4)
				{
					for(int i=bottom;i>=top;i--)
					{
						System.out.print(arr[i][left]+" ");
						count--;
					}
					left++;
					dir = 1;
				}				
			}
		}
		
	}
}
