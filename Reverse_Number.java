import java.util.*;
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0, a = n;
		
		while(a != 0)
		{
			ans = (ans*10) + (a%10);
			a=a/10;
		}
		System.out.println(ans);
		sc.close();
	}

}
