package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> hs = new HashSet<>();
		hs.add("Heli");
		hs.add("Heluka");
		hs.add("Helaika");
		hs.add("Heli"); //no duplicate
		hs.add("Lili");
		hs.addAll(null); //null value is allowed in a set(not as a key word but a value)
		System.out.println(hs+"\tsize: "+hs.size());
		
		//Retrieving data
		Iterator<String>  it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
			Thread.sleep(200);
		}
		System.out.println();
		

	}

}
