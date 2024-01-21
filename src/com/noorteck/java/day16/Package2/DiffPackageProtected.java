package com.noorteck.java.day16.Package2;
import com.noorteck.java.day16.Package1.DemoProtacted;
public class DiffPackageProtected {
	
	public static void main(String[] args) {
		System.out.println( DemoProtacted.count);
		 DemoProtacted.add(2,2);
		 
	
	 DemoProtacted obj =new  DemoProtacted();
	 System.out.println(obj.gender);
	 obj.subtract(2,2);
	

}
}
