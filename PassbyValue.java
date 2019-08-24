
public class PassbyValue {
	static void change(int x) {  //name of the method with argument is method signature
		x=22;
	}
	static void change(int[] x) {//method overloading
		for(int i=0;i<x.length;i++) {
			x[i]=x[i]+1;
		}
	}

	public static void main(String[] args) {
		int x=11;
		change(x);
		System.out.println(x);//returns 11 because it is pass by value, change will not be 
								//reflected if the parameter in the method is primitive type
		int[] n = new int[] {10,23,4};
		change(n);
		for(int i: n) {
			System.out.print(i+"\t");//returns 11,24,5 because pass by reference(obj type was passed as a parameter)
		}
		

	}

}
