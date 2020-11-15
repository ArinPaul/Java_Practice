package Pattern;
import java.util.*;
public class Pattern_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1, nst = 1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<nst;j++)
			{
				if(j==0 || j==nst-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			if(i >= n/2)
			{
				nsp++;
				nst-=2;
			}
			else
			{
				nsp--;
				nst+=2;
			}
		}
		sc.close();

	}

}
