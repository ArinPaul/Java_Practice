package Pattern;
import java.util.*;
public class Pattern_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp= n-1, nst= 1, k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print("\t");
			}
			for(int j=0;j<nst;j++)
			{
				System.out.print(k+"\t");
				k++;
			}
			nsp--;
			nst+= 2;
			System.out.println();
		}
		sc.close();
	}
}
