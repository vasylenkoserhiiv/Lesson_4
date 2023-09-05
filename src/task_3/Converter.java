package task_3;

public class Converter {
    public static double celsiusToKelvins(double celsius){
        double kelvins = celsius + 273.15;
        return kelvins;
    }
    public static double celsiusToFahrenheits(double celsius){
        double fahrenheits = (celsius * 9 / 5) + 32;
        return fahrenheits;
    }
    public static void convert(double celsius){
        double kelvin = celsiusToKelvins(celsius);
        double fahrenheit = celsiusToFahrenheits(celsius);
        System.out.println(celsius + "C is equals to " + kelvin + " K and " + fahrenheit + " F.");
    }
}
