package practiceseccion3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapFor 
{
	//It is the default constructor which creates an instance of HashMap with initial capacity 16 and load factor 0.75.
	//To access a value one must know its key. HashMap is known as HashMap because it uses a technique called Hashing. 
	//Hashing is a technique of converting a large String to small String that represents the same String. 
	// shorter value helps in indexing and faster searches. HashSet also uses HashMap internally.
	
	//Few important features of HashMap are: 	 
/*
	HashMap is a part of java.util package.
	HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
	It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
	HashMap doesn’t allow duplicate keys but allows duplicate values. 
	That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
	HashMap allows null key also but only once and multiple null values.
*/
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hama=new HashMap<Integer,String>();
		hama.put(101, "akash");
		hama.put(102,"sourabh");
		hama.put(103, "ajinkya");
		hama.put(104,"yogesh");
		//System.out.println(hama);
		//System.out.println(hama.entrySet());
		
		//if contains value then print true
		System.out.println(hama.containsValue("sourabh"));
		
		//if contains key then print true
		System.out.println(hama.containsKey(109));
		
		//if contains key then print value
		if(hama.containsKey(104))
		{
			System.out.println(hama.get(104));
		}
		
		//get value from key
		System.out.println(hama.get(103));
		
		//read values
		for(Map.Entry mn:hama.entrySet())
		{
			System.out.println(mn.getKey()+" "+mn.getValue());
		}
		
		//get only keyset
		System.out.println(hama.keySet());
		
		//replace value
		hama.replace(104, "ranjit");
		System.out.println(hama.get(104));
		
		//size of hashmap
		System.out.println(hama.size());
		
		//no need enter double key and value
		HashMap<String, Integer>hm3=new HashMap<>();
		hm3.put("ak", 1020);
		hm3.put("john", 789);
		System.out.println(hm3);
		
		for(Map.Entry single:hm3.entrySet())
		{
			System.out.println(single.getKey()+" "+single.getValue());
			
		}
	}

}
