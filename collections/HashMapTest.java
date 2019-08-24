package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// order is not kept, duplicate is not allowed, key, value pair 
/*
 * we can use TreeMap as such the keys will be stored in ascending order
 * null key is not allowed
 * HashTable has similar use and part of legacy class
 * null key or value is not allowed
 */
public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Double> bank = new HashMap<>();
		bank.put("Allen", 12000.00); //auto-boxing happens here
		bank.put("Berry", 10000.30);
		bank.put("Adilla", 1000.00);
		bank.put("Husnia", 13000.50);
		bank.put(null,null); //null key or null value can be given
		System.out.println(bank+"\tsize: "+bank.size());
		
		//the latest value is going to apply if duplicate key is given
		double bal = bank.get("Allen");
		System.out.println(bal);
		
		bal+=1000.00;
		bank.put("Allen", bal);
		System.out.println(bank);
		
		//to get only the key we use a method keyset()
		Set<String> keys = bank.keySet();
		System.out.println(keys);
		
		//retrieving data only Iterator works
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String names = it.next();
			System.out.println(names+"\t"+bank.get(names));
		}
		System.out.println();
		
		//Entry is each key value pair ,,,it has getKey(), getValue() methods
		
		Set<Map.Entry<String, Double>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Double>> its = entries.iterator();//we want to get each entries
		while(its.hasNext()) {
			Map.Entry<String, Double> ent = its.next();
			//System.out.println(ent+"\t"); //can use this too
			System.out.println(ent.getKey()+"\t"+ent.getValue());
			Thread.sleep(500);
		}
		System.out.println();
		/*
		 * Write a program to write 5 student records into a Hashtable and display the student 
		 * whose marks are the highest in the class.
		 */
		HashMap<String, Double> stu = new HashMap<>();
		stu.put("Maritu", 86.0);
		stu.put("Funchu", 87.0);
		stu.put("Meki", 90.2);
		stu.put("Husni", 95.0);
		Set<Map.Entry<String,Double>> ent = stu.entrySet();
		Iterator<Map.Entry<String, Double>> itStu = ent.iterator();
		while(itStu.hasNext()) {
			Map.Entry<String, Double> ent1 = itStu.next();
			System.out.println(ent1.getKey()+"\t"+ent1.getValue());
			}
		Map.Entry<String, Double> maxEntry = null;
		for (Map.Entry<String, Double> entry : stu.entrySet()) {
		  if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		    maxEntry = entry;
		  }
		}
		//System.out.println(maxEntry);
		String maxKey = maxEntry.getKey();
		System.out.println("---------------------");
		System.out.println("Student that got Max score: "+maxKey+"\t"+maxEntry.getValue());
		}
	
	}
	
			
		
		
		


	


