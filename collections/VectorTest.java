package collections;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector<Integer> v = new Vector<>(); //default capacity increament is 0, 10, 2*10, 2*20, ...
		//Vector<Integer> v = new Vector<>(5); //can give the initial point
		Vector<Integer> v = new Vector<>(5,3); //can give initial and increament
		System.out.println(v+"\tsize: "+v.size()+"\tcapacity: "+v.capacity());
		for(int i=10;i<=17;i++) {
			v.add(i);
		}
		System.out.println(v+"\tsize: "+v.size()+"\tcapacity: "+v.capacity());
		v.add(21);
		System.out.println(v+"\tsize: "+v.size()+"\tcapacity: "+v.capacity());

	}

}
