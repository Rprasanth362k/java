i
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new 
				HashMap<Integer, String>();
				hm.put(101, "Vignesh");
				hm.put(102, "Vignesh");
				hm.put(103, "Jagannath");
				hm.put(101, "thirumoorthi");
				System.out.println(hm);
				System.out.println(hm.keySet());
				System.out.println(hm.values());
				System.out.println(hm.entrySet());
				System.out.println(hm.containsKey(101));
				System.out.println(hm.containsValue("abcd"));
				Set s = hm.entrySet();
				  for(Object ob:s)
				    {
				    Entry <Integer,String>entry = (Entry) ob; 
				    System.out.println(entry.getKey() + " -> "+entry.getValue());
				    
				    /*
				     * Set s = hm.entrySet();
  for(Object ob:s)
    System.out.println(ob);
				     */
				    
				    }
	}
	   }

