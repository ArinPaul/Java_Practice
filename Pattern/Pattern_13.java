package Pattern;
import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=(2*n-1);i++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print("* ");
			}
			if(i>=n)
				k--;
			else
				k++;
			System.out.println();
		}
		sc.close();
	}

}
