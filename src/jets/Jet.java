package jets;

public class Jet {
	String model;
	double price, range, speed;
	Pilot pilot;
	
	public Jet(String model, double price, double range, double speed, Pilot pilot) {
		this.model = model;
		this.price = price;
		this.range = range;
		this.speed = speed / 767.269;
		this.pilot = pilot;
	}
	
	public Jet() {
		
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", price=" + price + ", range=" + range + ", speed=" + speed + ", pilot=" + pilot
				+ "]";
	}

	

}
