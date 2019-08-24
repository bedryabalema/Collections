package except;

/*
 * command line input
 * there are 5 possible ways of getting exception errors
 */
public class Except1 
{
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);///array out of bound, and Number format
			int b = Integer.parseInt(args[1]); //array out of bound, and Number format
			int c = a/b;  //arthmetic exception
			System.out.println("result = "+c);
		}
		
		
		//if we use this we cannot do the other exceptions since it will catch all the exception
		/*}catch(Exception e) {
		*	System.out.println("error could be one of (divide by zero, two cmd args, whole numbers,");
		*/ 
		catch(ArithmeticException e) {
		System.out.println("cannot divide with zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please provive two cmd args");
		}
		catch(NumberFormatException e) {
			System.out.println("can only give whole numbers");
		}
		System.out.println("Application completed");
	}
}
		
		


