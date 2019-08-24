package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) throws InterruptedException {
		TreeSet<String> hs = new TreeSet<>();
		hs.add("Heli");
		hs.add("Heluka");
		hs.add("Helaika");
		hs.add("Heli"); //no duplicate
		hs.add("Lili");
		//hs.addAll(null); //null value is allowed in a set(not as a key word but a value)
		System.out.println(hs+"\tsize: "+hs.size()); //data will be sorted
		
		//Retrieving data in ascending (default) sorted order
		Iterator<String>  it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
			Thread.sleep(200);
		}
		System.out.println();
		

	}
	

}


