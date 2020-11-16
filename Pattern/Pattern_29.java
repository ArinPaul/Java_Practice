package Pattern;
import java.util.*;
public class Pattern_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp= n-1, nst= 1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print("\t");
			}
			for(int j=0;j<nst;j++)
			{
				if(j==0 || j==nst-1)
				{
					System.out.print(i+1+"\t");
				}
				else
				{
					System.out.print(0+"\t");
				}
			}
			nsp--;
			nst+= 2;
			System.out.println();
		}
		sc.close();
	}

}
