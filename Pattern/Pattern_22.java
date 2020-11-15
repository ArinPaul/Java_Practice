package Pattern;
import java.util.*;
public class Pattern_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=n, nsp=-1;
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
			if(i==0)
			{
				for(int j=0;j<nst-1;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int j=0;j<nst;j++)
				{
					System.out.print("* ");
				}
			}
			nst--;
			nsp+=2;
			System.out.println();
			
		}
		sc.close();
	}

}
