package main.java.inheritance;

public class Iphone7 extends AbstractIphone {

	public Iphone7() {
		// TODO Auto-generated constructor stub
	}

	String headPhoneType;
	String applePay;

	public String getHeadPhoneType() {
		return headPhoneType;
	}

	public void setHeadPhoneType(String headPhoneType) {
		this.headPhoneType = headPhoneType;
	}

	public String getApplePay() {
		return applePay;
	}

	public void setApplePay(String applePay) {
		this.applePay = applePay;
	}

	@Override
	public String toString() {
		return "Iphone7 [headPhoneType=" + headPhoneType + ", applePay=" + applePay + "]";
	}

	@Override
	public void setColour(String colour) {
		// TODO Auto-generated method stub
		this.colour=colour;
	}

	@Override
	public void setMemory(String memory) {
		// TODO Auto-generated method stub
		this.memory=memory;
	}

}
