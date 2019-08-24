/*
 * inner class - increase encapsulation(binding data and functionality together)
 * increase readability and maintainability
 */
public class InnerClassTest {
	int x = 10;
	void disply() {
		System.out.println("inside outer class "+ x);
		Inner in = new Inner();  //calling inner class in the outer class
		in.display(); 
	}
	
	class Inner{
		int y = 20;
		void display() {
			System.out.println("inside inner class "+x+"\t"+y);//inner can access members of outer class directly
		}
	}

	public static void main(String[] args) {
		InnerClassTest out = new InnerClassTest();
		out.disply();
		System.out.println("--------------------------------");
		//creating inner class object outside outer class
		InnerClassTest.Inner in = out.new Inner();
		in.display();
	
		

	}

}
