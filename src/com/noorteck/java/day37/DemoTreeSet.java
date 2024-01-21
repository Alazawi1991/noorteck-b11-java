package com.noorteck.java.day37;

import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {

		TreeSet<String> stateset = new TreeSet<String>();
		stateset.add("Va");
		stateset.add("MA");
		stateset.add("NY");
		stateset.add("TX");
		stateset.add("NC");
		stateset.add("SC");
		stateset.add("AL");
		System.out.println(stateset);
		stateset.add("Va");
		stateset.add("Va");
		stateset.add("Va");
		System.out.println(stateset);
		stateset.add(null);

		System.out.println(stateset);
	}

}

/**


HashSet									LinkedHashSet		 					TreeSet
----------------------------------------------------------------------------------------------
Does Not Keep Insertion Order	|	Keeps the Insertion Order		|	Does not keep Insertion ORder, 
																			but sorts in ascending order

No Duplicate Value				|	No Duplicate Value				|	No Duplicate Value

Only 1 Null Value				|	Only 1 Null Value				|	No Null Value


*/

