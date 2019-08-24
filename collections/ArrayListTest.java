package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListTest {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> in = new ArrayList<>();
		for(int i=0;i<14;i++) {
			in.add(i); //auto-unboxing
			System.out.print(in.get(i)+"\t");
		}
		System.out.println();
		System.out.println(in);
		/*
		 * d/t way of retrieving data from collection
		 */
		//normal for Loop
		for(int i=0;i<in.size();i++) {
			System.out.print(in.get(i)+"\t");
		}
		System.out.println();
		Thread.sleep(1000);
		
		//Extended for loop
		for(int x:in) {
			System.out.print(in.get(x)+"\t");
		}
		System.out.println();
		Thread.sleep(1000);
		
		//using Iterator, can iterate from left to right
		//Iterator is mostly used because it has additional method   -remove() that makes the array list empty
		ListIterator<Integer> lit = in.listIterator(); 
		while(lit.hasNext()) {
			int n = lit.next();
			System.out.print(n+"\t");
		}
		System.out.println();
		Thread.sleep(1000);
		
		//using list Iterator, can traverse from the last
		
		while(lit.hasPrevious()) {
			int n = lit.previous();
			System.out.print(n+"\t");
		}
		System.out.println();
		Thread.sleep(1000);
		
		//using java.util.Enumeration
		Enumeration<Integer> en = Collections.enumeration(in);
		while(en.hasMoreElements()) {
			int n = en.nextElement();
			System.out.print(n+"\t");
		}
		System.out.println();
		Thread.sleep(1000);
		
		}
	

}
