package Pattern;
import java.util.*;
public class Pattern_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1,nsp= n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<nst;j++)
			{
				System.out.print("1 ");
			}
			nsp--;
			nst+= 2;
			System.out.println();
		}
		sc.close();
	}
}
