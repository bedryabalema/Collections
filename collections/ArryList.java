package collections;

import java.util.ArrayList;

public class ArryList {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		System.out.println("names: "+l+"\tSize: "+l.size() );
		l.add("Helen");
		l.add("Konjo");
		l.add("David");
		System.out.println("names: "+l+"\tSize: "+l.size() );
		l.add(3,"Bedrya");
		l.add(2, "John");
		System.out.println("names: "+l+"\tSize: "+l.size() );
		l.set(3, "Grace");  //replace the 3rd element with this
		System.out.println("names: "+l+"\tSize: "+l.size() );
		System.out.println(l.get(3));
		l.remove(3);
		System.out.println("names: "+l+"\tSize: "+l.size() );
		
		
		
	}

}
