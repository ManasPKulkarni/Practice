package com.devSense.Patterns.Observer;

public class StaticDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	
	public StaticDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Min/Max Temperature in degrees F: " + temperature +"/" + temperature + "/" + temperature);
		System.out.println();
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
