import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

		while(true)
		{
			char a = sc.nextLine().charAt(0);
			if(a=='X' || a=='x') {
			break;
			}
			else if(a == '+')
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println((b+c));
				continue;
			}
			else if(a == '-')
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println((b-c));
				continue;
			}
			else if(a == '*')
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println((b*c));
				continue;
			}
			else if(a == '/')
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println((b/c));
				continue;
			}
			else if(a == '%')
			{
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println((b%c));
				continue;
			}
			else {
				System.out.println("Invalid operation. Try again.");
			}
			
		}
    }
}

