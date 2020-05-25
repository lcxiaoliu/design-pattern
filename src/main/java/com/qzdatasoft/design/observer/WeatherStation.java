package com.qzdatasoft.design.observer;

import com.qzdatasoft.design.observer.observer.CurrentConditionsDisplay;
import com.qzdatasoft.design.observer.subject.WeatherData;

/**
 * <h3>design-pattern</h3>
 * <p>气象站</p>
 *
 * @author : shuhua.Liu
 * @date : 2020-05-25 23:08
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65 ,30.4f );
        weatherData.setMeasurements(82,70 ,29.2f );
        weatherData.setMeasurements(78,90 ,29.2f );
    }
}
