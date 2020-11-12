package Pattern;
import java.util.*;
public class Pattern_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=(2*n-1);i++)
		{
			for(int j=1;j<=(2*k-1);j++)
			{
				if(j%2==0)
					System.out.print("* ");
				else
					System.out.print(k+" ");
			}
			System.out.println();
			if(i>=n)
				k--;
			else
				k++;
		}
		sc.close();

	}
}
