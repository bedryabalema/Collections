/*
 * member data is declared static , executed when class is loaded before the object
 * static member datas are shared by all objects
 */
public class Counter {
	//int count = 10;
	static int count = 10;
	void inc() {
		count= count+1;
	}

	public static void main(String[] args) {
		Counter c1 = new Counter(); //c1.count = 10
		Counter c2 = new Counter();  //c2.count = 10
		Counter c3 = new Counter();  //c3.count = 10
		c1.inc();  // /c1.count=11  //c1.count = 11
		c2.inc();  ///c2.count=11  //c2.count = 12
		c3.inc();  ///c3.count=11   //c3.count = 13
		System.out.println(c1.count);  //11 when not static    //when static 13
		System.out.println(c2.count);  //11 when not static   //when static 13
		System.out.println(c3.count);  //11 when not static    //when static 13
		

	}

}
