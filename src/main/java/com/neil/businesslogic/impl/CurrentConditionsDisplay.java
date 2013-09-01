package com.neil.businesslogic.impl;

import com.neil.businesslogic.DisplayElement;
import com.neil.businesslogic.Observer;
import com.neil.businesslogic.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject subject;

	public CurrentConditionsDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "C degrees and :" + humidity + "% humidity");
	}
}