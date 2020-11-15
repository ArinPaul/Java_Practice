package Pattern;
import java.util.*;
public class Pattern_12 {

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
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("! ");
				}
			}
			nsp--;
			nst+=2;
			System.out.println();
		}
		sc.close();

	}

}
