package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentRecord {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("Ali", 55.0);
		hm.put("Munir", 65.0);
		hm.put("Ahmed", 80.0);
		hm.put("Amina", 90.0);
		
		//Iterator<String> it = keys.iterator();
		Set<Map.Entry<String,Double>> ent = hm.entrySet();
		Iterator<Map.Entry<String, Double>> itStu = ent.iterator();
		while(itStu.hasNext()) {
			Map.Entry<String, Double> ent1=itStu.next();
			System.out.println(ent1);
			//if(ent1.getValue()!=null &&ent1.getValue()>itStu.)
			
			
		}
		/*while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			Double max = hm.get(name);
			for(int i=0;i<name.length();i++) {
				if(hm.get(name) > max) //hm.get(name)
					max = hm.get(name);
			}
			System.out.println(max);
			}*/
		
	}
		
		

	}


