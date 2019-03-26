package com.dimple.headfirst.observer;

public class WeatherStation {
	public static void main(String[] args) {
		// 建立有一个WeatherData对象
		WeatherData weatherData = new WeatherData();
		
		// 建立布告板，把WeatherData对象传给它们
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
