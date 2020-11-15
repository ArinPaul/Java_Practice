package Pattern;
import java.util.*;
public class Pattern_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1, nst = 1;
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			for(int j = 0;j<nst;j++)
			{
				System.out.print("*   ");
			}
			nsp--;
			nst++;
			System.out.println();
		}
		sc.close();

	}

}
