package main.java.inheritance;

public class Iphone {

	public Iphone() {
		// TODO Auto-generated constructor stub
	}

	String colour;
	String manufacturer;
	String memory;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Iphone [colour=" + colour + ", manufacturer=" + manufacturer + ", memory=" + memory + ", getColour()="
				+ getColour() + ", getManufacturer()=" + getManufacturer() + ", getMemory()=" + getMemory() + "]";
	}

}
