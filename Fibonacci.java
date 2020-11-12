import java.util.*;
public class Fibonacci 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1, counter =1;
		while(counter <= n+1)
		{
			System.out.println(a);
			int sum = a+b;
			a=b;
			b=sum;
			counter++;
		}
		sc.close();
	}

}
