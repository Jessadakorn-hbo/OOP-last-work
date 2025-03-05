package it.utils.converter;

public interface TemperatureConverter {
    double celsiusToFahrenheit(double celsius);
    double celsiusToKelvin(double celsius);
    double fahrenheitToCelsius(double fahrenheit);
    double fahrenheitToKelvin(double fahrenheit);
    double kelvinToCelsius(double kelvin);
    double kelvinToFahrenheit(double kelvin);
}

