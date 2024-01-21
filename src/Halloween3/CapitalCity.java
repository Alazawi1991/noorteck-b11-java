package Halloween3;

public class CapitalCity extends City {
	

	private final int population;
	private static final String TYPE = "ACV";
	public CapitalCity(String cityName, String countryName, int population) {
		super(cityName, countryName, population);
		this.population = population;
		population = 123;
	}
	@Override
	public void displayInfo() {

		System.out.println(TYPE + " of " + getName());
	}

	@Override
	protected void setCityMeeting() {

		System.out.println("CapitalCity; Meeting");
		super.setCurrency();
	}

	public void setCapital() {
	}
}
