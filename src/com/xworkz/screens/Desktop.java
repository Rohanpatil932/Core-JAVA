package com.xworkz.screens;

public class Desktop extends Computer {
private double ScreenResolution;

public Desktop(double screenResolution) {
	super();
	ScreenResolution = screenResolution;
}

public Desktop() {
	super();
}

public double getScreenResolution() {
	return ScreenResolution;
}

public void setScreenResolution(double screenResolution) {
	ScreenResolution = screenResolution;
}

}
