package Halloween3;

public abstract class Country extends World{
	private String name;
	private int population;
	public Country(String name, int population) {
		super(name);
		this.name = name;
		this.population = population;
	}
	public void displayInfo() {
		System.out.println("Name: " + name + ", Population: " + population);
	}
	
	public void setCurrency() {
		System.out.println("Dollar: $");
	}
	
	public void getHoliday() {
		System.out.println("Country: Holiday");
	}
	
	public abstract void setLanguage();
	public abstract void  setFood();
}

