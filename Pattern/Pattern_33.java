package Pattern;
import java.util.*;
public class Pattern_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = 2*n-1,nst = 1;
		for(int i=0;i<n;i++)
		{
			int k = n-i;
			for(int j=0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<nst;j++)
			{
				if(j==nst/2)
				{
					System.out.print("0 ");
				}
				if(j<nst/2)
				{
					System.out.print(k+" ");
					k++;
				}
				if(j>nst/2)
				{
					System.out.print(k-1+" ");
					k--;
				}
			}
			System.out.println();
			nsp--;
			nst+=2;
		}
		sc.close();
	}

}
