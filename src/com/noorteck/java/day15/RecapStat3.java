package com.noorteck.java.day15;

public class RecapStat3 {
	public static void getCourseData() {
		// 1. TODO call [courseID] variable and assign value = 555;
		RecapStat1 obj = new RecapStat1();
		obj.courseID = 555;
		// 2. TODO call [title] variable and assign value = "Algebra";
		RecapStat1 obj1 = new RecapStat1();
		obj1.title = "Algebra";
		// 3. TODO print the [courseID] variable
		System.out.println(obj.courseID);
		// 4. TODO print the [title] variable
		System.out.println(obj1.title);
	}

	public static void getStudentData() {

		// 5. TODO call [departmentID] variable and assign value = 3333;
		RecapStat1.departmentID = 3333;
		// 6. TODO call [department] variable and assign value = Health;
		RecapStat1.department = "Health";
		// 7. TODO print the [departmentID] variable
		System.out.println(RecapStat1.departmentID);
		// 8. TODO print the [department] variable
		System.out.println(RecapStat1.department);
	}

	public static void getSchoolData() {
		// 9. TODO call method [register()]
		RecapStat1 obj = new RecapStat1();
		obj.register("ahmmed", "alwahab", 32);
		// 10. TODO call method [setStudentData()]
		RecapStat1 obj2 = new RecapStat1();
		obj2.setStudentData();
		// 11. TODO call method [setCourseData()]
		RecapStat1 obj3 = new RecapStat1();
		obj3.setStudentData();
	}

	public static void getDepartmentData() {
		// 12. TODO call method [purchase()]
		RecapStat1.purchase("book", 7, 40.11);
		// 13. TODO call method [setDepartmentData()]

		RecapStat1.setDepartmentData();
		// 14. TODO call method [setSchoolData()]

		RecapStat1.setSchoolData();
	}

}
