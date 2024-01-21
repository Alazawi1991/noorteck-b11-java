package com.noorteck.java.day38;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> coutseMap = new HashMap<Integer, String>();

		coutseMap.put(100, "Java");
		coutseMap.put(200, "Selenium");
		coutseMap.put(300, "SQL");
		coutseMap.put(400, "API");
		coutseMap.put(500, "Jenkins");

		System.out.println(coutseMap);

		LinkedHashMap<Integer, String> coutseMap2 = new LinkedHashMap<Integer, String>();

			coutseMap2.put(100, "Java");
			coutseMap2.put(200, "Selenium");
			coutseMap2.put(300, "SQL");
			coutseMap2.put(400, "API");
			coutseMap2.put(500, "Jenkins");

			System.out.println(coutseMap2);

}
}
/**


HashMap											LinkedHashMap				
-------------------------------------------------------------------------------------------------	
1. Does not keep insertion order					1. Keeps the insertion order
2. Key is Unique, Value can be duplicate			2. Key is Unique, Value can be duplicate
3. Can have 1 NULL key								3. Can have 1 NULL key
4. Can have 1 or more NULL value					4. Can have 1 or more NULL value
5. NOt Synchronized 								5. NOt Synchronized 



 */

