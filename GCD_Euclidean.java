import java.util.*;
public class GCD_Euclidean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
				
		while(dividend % divisor != 0)
		{
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
		sc.close();
	}

}
