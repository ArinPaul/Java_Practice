package Pattern;
import java.util.*;
public class Pattern_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1, nst = 1;
		for(int i=0;i<(2*n-1);i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print("  ");	
			}
			for(int j=0;j<nst;j++)
			{
				System.out.print("* ");	
			}
			System.out.println();
			if(i>= n-1)
			{
				nst--;
				nsp++;
			}
			else
			{
				nst++;
				nsp--;
			}
		}
		sc.close();
	}

}
