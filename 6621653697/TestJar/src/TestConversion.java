import it.utils.converter.*;

public class TestConversion {
    public static void main(String[] args) {
        Temperature converter = new Temperature();

        double celsius = 25.0;
        double fahrenheit = 77.0;
        double kelvin = 298.15;

        System.out.println("Celsius to Fahrenheit: " + converter.celsiusToFahrenheit(celsius));
        System.out.println("Celsius to Kelvin: " + converter.celsiusToKelvin(celsius));
        System.out.println("Fahrenheit to Celsius: " + converter.fahrenheitToCelsius(fahrenheit));
        System.out.println("Fahrenheit to Kelvin: " + converter.fahrenheitToKelvin(fahrenheit));
        System.out.println("Kelvin to Celsius: " + converter.kelvinToCelsius(kelvin));
        System.out.println("Kelvin to Fahrenheit: " + converter.kelvinToFahrenheit(kelvin));
    }
}