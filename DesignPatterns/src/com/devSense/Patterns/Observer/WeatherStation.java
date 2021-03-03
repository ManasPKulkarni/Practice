package com.devSense.Patterns.Observer;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay cuDisplay = new CurrentConditionsDisplay(weatherData);
		StaticDisplay stDisplay = new StaticDisplay(weatherData);
		
		weatherData.setMeasurements(80, 85, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(79, 69, 30.2f);

	}

}
