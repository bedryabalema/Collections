package except;
import java.util.Scanner;

public class ExcetFinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Result = "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: "+e);
		}
		// this two sentences will execute no mater what(evenif the exception is not caught)
		finally {
			System.out.println("Application Developed by designed by ");
			System.out.println("admin@helaika");
		}
		System.out.println("Application Completed");
	}

}
