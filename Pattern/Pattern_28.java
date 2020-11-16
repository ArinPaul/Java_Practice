package Pattern;
import java.util.*;
public class Pattern_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1, nsp= n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			int k=i-1;
			for(int j=1;j<=nst;j++)
			{
				if(j<= nst/2 +1) 
				{
					k++;
					System.out.print(k+" ");
				}
				else
				{
					k--;
					System.out.print(k+" ");
				}
			}
			nsp--;
			nst+= 2;
			System.out.println();
		}
		sc.close();

	}

}
