package Pattern;
import java.util.*;
public class Pattern_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j == n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(n-j+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
