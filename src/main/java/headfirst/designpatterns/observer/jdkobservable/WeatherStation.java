package headfirst.designpatterns.observer.jdkobservable;

import headfirst.designpatterns.observer.jdkobservable.subject_observable.WeatherData;
import headfirst.designpatterns.observer.jdkobservable.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.jdkobservable.observer.ForecastDisplay;
import headfirst.designpatterns.observer.jdkobservable.observer.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
