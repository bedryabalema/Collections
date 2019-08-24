
public class Inter1Test implements Inter1{
	@Override
	public int addNum(int x, int y) {
		return x+y;
	}

	@Override
	public int subNum(int x, int y) {
		return x-y;
	}

	public static void main(String[] args) {
		Inter1 obj = new Inter1Test();
		System.out.println(obj.a+"\t"+obj.b);
		System.out.println(obj.addNum(a, b));
		System.out.println(Inter1.a+"\t"+Inter1.b);// cause the member datas of an interface 
													//public static final by default and canot be changed

	}

	

}
