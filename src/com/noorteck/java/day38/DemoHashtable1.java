package com.noorteck.java.day38;

import java.util.Hashtable;

public class DemoHashtable1 {

	public static void main(String[] args) {

		Hashtable<String, String> stateMap = new Hashtable<String, String>();

		stateMap.put("VA", "Virgina");
		stateMap.put("CA", "Californa");
		stateMap.put("FL", "Florida");
		stateMap.put("NY", "New York");
		stateMap.put("AZ", "Arizona");
		stateMap.put("AL", "Alaska");

		System.out.println(stateMap);
		stateMap.put("java", "coffee");
		stateMap.put("sql", "coffee");

		System.out.println(stateMap);

		// stateMap.put("SC", null); error we can't have null value

		// stateMap.put(null, "South Carolina"); error we can't have null value
	}
		}
/**


HashMap											LinkedHashMap								TreeMap							   Hashtable
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
1. Does not keep insertion order			1. Keeps the insertion order				1. Does not keep insertion order			1. Does not keep insertion order
																				but stores in ASCENDING ORDER (Key)
																							   
2. Key is Unique, Value can be duplicate	2. Key is Unique, Value can be duplicate	2. Key is Unique, Value can be duplicate	2. Key is Unique, Value can be duplicate
3. Can have 1 NULL key						3. Can have 1 NULL key						3. Key CANNOT be NULL						3. Key CANNOT be NULL	
4. Can have 1 or more NULL value			4. Can have 1 or more NULL value			4. Can have 1 or more NULL value			4. Value CANNOT be NULL	
5. NOt Synchronized 						5. NOt Synchronized 						5. NOt Synchronized 						5. Synchronized 	


HashMap is the FASTEST 

TreeMap is the SLOWEST

 */