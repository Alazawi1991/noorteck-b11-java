package Halloween3;

public class CityDemo {

	public static void main(String[] args) {

		Country country = new City("r", "usa", 123);

		country.displayInfo();

		City c = new City("Sterling", "usa", 123);
		c.setCityMeeting();
		//country.setCityMeeting();

		country = new SmallCity("  ","    ",123);

	}
}
