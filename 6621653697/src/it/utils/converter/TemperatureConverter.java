package it.utils.converter;

public interface TemperatureConverter {
    double celsiusToFahrenheit(double celsius);
    double celsiusToKelvin(double celsius);
    double fahrenheitToCelsius(double fahrenheit);
    double fahrenheitToKelvin(double fahrenheit);
    double kelvinToCelsius(double kelvin);
    double kelvinToFahrenheit(double kelvin);
}

class TemperatureConversion implements TemperatureConverter {
    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    @Override
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}


