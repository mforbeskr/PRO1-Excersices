package session1_intro;

public class WeatherExcercise

{
  public static void main(String[] args)
  {
    boolean itIsSunny = true;
    boolean itIsNotSunny = false;
    boolean itIsSnowy = true;
    boolean itIsNotSnowy = false;

    itIsNiceWeather1(5);
    itIsNiceWeather1(10);
    itIsNiceWeather1(15);
    itIsNiceWeather1(26);

    itIsNiceWeather2(5, itIsSunny);
    itIsNiceWeather2(10, itIsNotSunny);
    itIsNiceWeather2(15, itIsSunny);
    itIsNiceWeather2(25, itIsNotSunny);

    itIsNiceWeather3(-10, itIsSunny, itIsSnowy);
    itIsNiceWeather3(-5, itIsNotSunny, itIsNotSnowy);
    itIsNiceWeather3(-2, itIsNotSunny, itIsSnowy);
    itIsNiceWeather3(5, itIsSunny, itIsNotSnowy);
    itIsNiceWeather3(10, itIsNotSunny, itIsSnowy);
    itIsNiceWeather3(15, itIsSunny, itIsNotSnowy);
    itIsNiceWeather3(25, itIsNotSunny, itIsNotSnowy);
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

    boolean niceWeather =  niceColdWeather|| niceWarmWeather || itIsComfortablyWarm;

    System.out.println("Current temperature: " + temperature);
    System.out.println("Warm & sunshine or Nice & snowy: " + niceWeather);
    System.out.println("-----------------");
  }
}