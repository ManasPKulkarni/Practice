package com.devSense.Patterns.Observer;

import java.util.ArrayList;

/*	Observer Pattern = publishers + subscribers
 * 	e.g. NewsPaper subscriptions, any OTT platforms, Weather Forecast Service
 * 	
 * 	Definition: Observer Pattern defines a one to many dependency between objects
 * 	so that when one object changes the state, all of its dependents are notified 
 * 	and updated automatically. 
 * */
public class WeatherData implements Subject {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
