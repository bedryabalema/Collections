package except;

public class Except2 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);///array out of bound, and Number format
			int b = Integer.parseInt(args[1]); //array out of bound, and Number format
			int c = a/b;  //arthmetic exception
			System.out.println("result = "+c);
		}
		catch(Exception e){
			System.out.println("Error occured");
			System.out.println("message: "+e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Application completed");
	}
		

	}


