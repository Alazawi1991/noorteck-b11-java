package Halloween3;

public class City extends Country {
	private final String CITY_NAME;

	public City(String cityName, String countryName, int population) {
		super(countryName, population);
		CITY_NAME = cityName;

	}

	public String getCityName() {
		return CITY_NAME;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("City Name: " + CITY_NAME);
	}

	@Override
	public void setCurrency() {
		System.out.println("Euro: €");
	}

	@Override
	public void getHoliday() {
		System.out.println("City: Holiday");
	}

	void setCityMeeting() {
		System.out.println("City; Meeting");
	}

	@Override
	public void setLanguage() {

	}

	@Override
	public void setFood() {

	}

	@Override
	public void setRegion() {

	}

	@Override
	public void setOcean() {

	}
}

/**
 * 
 * Method OVerriding 1. IS -A Relationship 2. method name MUST be same 3.
 * Parameters MUST be same
 * 
 * 4. The only reason child class overrides parent class method becuase it wants
 * to change the body, the implementation
 * 
 * 
 * Method override when child class has same method as parent clas
 * 
 * 1. Must have IS-A Relationship 2. Method Name must be same 3. Parameters must
 * be SAME
 * 
 * 
 * Method overloading: in same class when we have 2 or more methods with same
 * name 1. Same Class 2. Same Method name 3. Diff Parameter: a. Diff # of params
 * b. Diff data type of params c. Sequence of param data type diff
 * 
 * 
 * What are the diff reason child class wont be able to override a method from
 * parent class
 * 
 * 1. if parent method static then child cannot override 2. if child class makes
 * more restrive the access modifier than parent method then it cannot override
 * 3. if parent method access modifier is PRIVATE then cannot override 4. if
 * method is final then child cannot override 
 * 
 */