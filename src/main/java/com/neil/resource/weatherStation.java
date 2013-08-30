package com.neil.resource;

import com.neil.businesslogic.impl.CurrentConditionsDisplay;
import com.neil.businesslogic.impl.WeatherData;

public class weatherStation {
    public static void main(String[] args) {
	
	WeatherData weatherData = new WeatherData();	
	CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);		
	weatherData.setMeasurements(25, 80, 4f);	
    }
}