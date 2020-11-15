package Pattern;
import java.util.*;
public class Pattern_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = 0, nst = 2*n-1;
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			for(int j = 0;j<nst;j++)
			{
				System.out.print("* ");
			}
			nsp++;
			nst-=2;
			System.out.println();
		}
		sc.close();

	}

}
