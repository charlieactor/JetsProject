package jets;

public class Pilot {
	String name;
	int yearsExperience, age;
	
	
	
	public Pilot(String name, int yearsExperience, int age) {
		super();
		this.name = name;
		this.yearsExperience = yearsExperience;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsExperience() {
		return yearsExperience;
	}
	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pilot [name=" + name + ", yearsExperience=" + yearsExperience + ", age=" + age + "]";
	}
	
	
}
