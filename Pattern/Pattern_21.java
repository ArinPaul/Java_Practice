package Pattern;
import java.util.*;
public class Pattern_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1, nsp=(2*n)-3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<nst;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			if(i==(n-1))
				nst--;
			for(int j=0;j<nst;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			nst++;
			nsp-=2;
		}
		sc.close();
	}
}
