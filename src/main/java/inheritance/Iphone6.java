package main.java.inheritance;

public class Iphone6 extends Iphone {

	public Iphone6() {
		// TODO Auto-generated constructor stub
	}

	String frontCameraType;
	String SenstiveTouch;

	public String getFrontCameraType() {
		return frontCameraType;
	}

	public void setFrontCameraType(String frontCameraType) {
		this.frontCameraType = frontCameraType;
	}

	public String getSenstiveTouch() {
		return SenstiveTouch;
	}

	public void setSenstiveTouch(String senstiveTouch) {
		SenstiveTouch = senstiveTouch;
	}

	@Override
	public String toString() {
		return "Iphone6 [frontCameraType=" + frontCameraType + ", SenstiveTouch=" + SenstiveTouch + "]";
	}

}
