package com.devSense.Patterns.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}
	
	public void getHeatIndex () {
		
		heatIndex = 
		16.923 + 1.85212 * 10-1 * T + 5.37941 * RH - 1.00254 * 10-1 * T
		* RH + 9.41695 * 10-3 * T2 + 7.28898 * 10-3 * RH2 + 3.45372 * 10-4
		* T2 * RH - 8.14971 * 10-4 * T * RH2 + 1.02102 * 10-5 * T2 * RH2 -
		3.8646 * 10-5 * T3 + 2.91583 * 10-5 * RH3 + 1.42721 * 10-6 * T3 * RH
		+ 1.97483 * 10-7 * T * RH3 - 2.18429 * 10-8 * T3 * RH2 + 8.43296 *
		10-10 * T2 * RH3 - 4.81975 * 10-11 * T3 * RH3 ;
	}

}
