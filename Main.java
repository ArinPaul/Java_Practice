import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1,nsp=n-1,nst=1;;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<nsp;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=0;j<nst;j++)
        	{
        		int r = k%10;
        		k/=10;
        		System.out.print(r+" ");
        	}
        	nsp--;
        	nst++;
        	k=(int)Math.pow(11,i+1);
        	System.out.println();
        	
        }
		sc.close();
    }
}
