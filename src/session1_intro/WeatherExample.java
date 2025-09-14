package session1_intro;

public class WeatherExample
{

  public static void main(String[] args)
  {
    boolean itIsSunny = true;
    boolean itIsNotSunny = false;
    boolean itIsSnowy = true;
    boolean itIsNotSnowy = false;

    callAll(-10, itIsSunny, itIsSnowy);
    callAll(-5, itIsNotSunny, itIsNotSnowy);
    callAll(-2, itIsNotSunny, itIsSnowy);
    callAll(5, itIsSunny, itIsNotSnowy);
    callAll(10, itIsNotSunny, itIsSnowy);
    callAll(15, itIsSunny, itIsNotSnowy);
    callAll(25, itIsNotSunny, itIsNotSnowy);
  }

  static void callAll(int temperature, boolean itIsSunny, boolean itIsSnowy)
  {
    itIsNiceWeather1(temperature);
    itIsNiceWeather2(temperature, itIsSunny);
    itIsNiceWeather3(temperature, itIsSunny, itIsSnowy);
  }

  static void itIsNiceWeather1(int temperature)
  {
    boolean notTooCold = temperature >= 15;
    boolean notTooWarm = temperature <= 25;
    boolean itIsComfortablyWarm = notTooCold && notTooWarm;

    System.out.println("Current temperature: " + temperature);
    System.out.println("Comfortable: " + itIsComfortablyWarm);
    System.out.println("-----------------");
  }

  static void itIsNiceWeather2(int temperature, boolean itIsSunny)
  {
    boolean niceTemperatureWarm = temperature >= 15 && temperature <= 25;
    boolean niceWarmWeather = niceTemperatureWarm && itIsSunny;
    System.out.println("Current temperature: " + temperature);
    System.out.println("Warm with sunshine: " + niceWarmWeather);
    System.out.println("-----------------");
  }

  static void itIsNiceWeather3(int temperature, boolean itIsSunny, boolean itIsSnowy)
  {
    boolean niceTemperatureCold = temperature >= -10 && temperature <= -2;
    boolean niceTemperatureWarm = temperature >= 15 && temperature <= 25;

    boolean niceColdWeather = niceTemperatureCold && itIsSnowy;
    boolean niceWarmWeather = niceTemperatureWarm && itIsSunny;

    boolean notTooCold = temperature >= 15;
    boolean notTooWarm = temperature <= 25;
    boolean itIsComfortablyWarm = notTooCold && notTooWarm;

    boolean niceWeather = niceColdWeather || niceWarmWeather || itIsComfortablyWarm;

    System.out.println("Current temperature: " + temperature);
    System.out.println("Warm & sunshine or Nice & snowy: " + niceWeather);
    System.out.println("-----------------");
  }
}