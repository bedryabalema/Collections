
public class Wrapper {

	public static void main(String[] args) {
		int n = 20;
		Integer i1 = n;   // auto-boxing
		int x = i1;   // auto-unboxing
		
		Integer n1 = new Integer(22);   //auto - boxing
		Integer n2 = new Integer("22");
		System.out.println(n1+"\t"+n2);
		
		byte b = n1.byteValue();   //auto - unboxing
		int i = n1.intValue();
		float f = n1.floatValue();
		System.out.println(b+"\t"+i+"\t"+f);
		

	}

}
