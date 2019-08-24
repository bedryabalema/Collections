
public class AbsTest extends Polymorphism {
	void subNum(int x, int y) {
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		Polymorphism obj = new AbsTest();//polymorphism- we can access all the methods and members 
		obj.addNum(9, 3);               //defined in the super class
		obj.subNum(9, 3);

	}

}
