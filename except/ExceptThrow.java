package except;

public class ExceptThrow {
	void calc(int x, int y) {
		if(y==0) {
			throw new ArithmeticException("division by zero");}
			int z = x/y;
			System.out.println("result = "+z);
		
	}

	public static void main(String[] args) {
		ExceptThrow obj = new ExceptThrow();
		try {
			obj.calc(2, 0);
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
			System.out.println(e.toString());
			}
	}

}
