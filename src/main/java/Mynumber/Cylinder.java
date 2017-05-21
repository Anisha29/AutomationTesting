package main.java.Mynumber;

public class Cylinder extends Common
{
	public double volume(double r,double h)
	{
		double vol=pi*getSquare(r)*h;
		return vol;
	}
}