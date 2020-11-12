package Pattern;

import java.util.*;

public class Pattern_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n/2;
		int nsp = 1, k = nst;
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
			for(int j=0;j<nst;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i >= k)
			{
				nst++;
				nsp-= 2;
			}
			else
			{
				nst--;
				nsp+= 2;
			}			
		}		
		sc.close();
	}

}
