package main.java.inheritance;

public abstract class AbstractIphone {

	String colour;
	String manufacturer;
	String memory;

	public String getColour() {
		return colour;
	}

	public abstract void setColour(String colour);

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMemory() {
		return memory;
	}

	public abstract void setMemory(String memory);

	

	@Override
	public String toString() {
		return "Iphone [colour=" + colour + ", manufacturer=" + manufacturer + ", memory=" + memory + ", getColour()="
				+ getColour() + ", getManufacturer()=" + getManufacturer() + ", getMemory()=" + getMemory() + "]";
	}

}
