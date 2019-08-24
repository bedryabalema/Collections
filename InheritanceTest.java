class B extends A{
	int a = 12;
	int b = 23;
	int c = 10;
	int d = 20;
	B(){  //there is a hidden statement  super();  -call to the default constructor of super class
		System.out.println("class B constructor");
	}
	/*void sum(int x, int y) {
		int z= x+y;
		System.out.println("sum= "+z);}*/
	void diff(int x, int y) {
		int z= x-y;
		System.out.println("Difference = "+z);}
	void display() {
		System.out.println("a\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+super.a+"\t"+super.b);
	}

}
public class InheritanceTest {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a+"\t"+b.b+"\t"+b.c+"\t"+b.d);
		b.sum(2,3);
		b.diff(3,1);
		// TODO Auto-generated method stub

	}

}
