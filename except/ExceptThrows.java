package except;
/*
 * there is a chance of this exception(InterupptedException) in this method but this method will not take care of it
 */
public class ExceptThrows {
	//void myMethod() throws ArithmeticException { //unckecked exception is okay, compiler handles it
	void myMethod() throws InterruptedException { //checked exception(run time error)we have to handle it manually in the 
		System.out.println("Business Logic...");  //main method, this is like an intimation to take care of it later in the main
	}
	

	public static void main(String[] args) //throws Exception
	{
		ExceptThrows obj = new ExceptThrows();
		try {
		obj.myMethod();
		}catch(Exception e) { }  // we can also do throws Exception next to main method
		

	}

}
