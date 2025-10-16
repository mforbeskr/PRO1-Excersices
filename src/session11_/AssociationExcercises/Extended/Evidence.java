package session11_.AssociationExcercises.Extended;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evidence {

  private String description;
  private String type;
  private String location;
  private String suspect;
  private String weapon;
  private LocalDate date;
  private LocalTime time;
  private double latitude;
  private double longitude;
  private double altitude;
  private double speed;

  public Evidence(String description, String type, String location,
      String suspect, String weapon)
  {
    this.description = description;
    this.type = type;
    this.location = location;
    this.suspect = suspect;
    this.weapon = weapon;
    this.date = date;
    this.time = time;
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
    this.speed = speed;
  }

  public Evidence(String description, String type, String location,
      String suspect, String weapon, LocalDate date, LocalTime time,
      double latitude, double longitude, double altitude, double speed)
  {
    this.description = description;
    this.type = type;
    this.location = location;
    this.suspect = suspect;
    this.weapon = weapon;
    this.date = date;
    this.time = time;
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
    this.speed = speed;
  }

  public String getDescription()
  {
    return description;
  }

  public String getType()
  {
    return type;
  }

  public String getLocation()
  {
    return location;
  }

  public String getSuspect()
  {
    return suspect;
  }

  public String getWeapon()
  {
    return weapon;
  }

  public LocalDate getDate()
  {
    return date;
  }

  public LocalTime getTime()
  {
    return time;
  }

  public double getLatitude()
  {
    return latitude;
  }

  public double getLongitude()
  {
    return longitude;
  }

  public double getAltitude()
  {
    return altitude;
  }

  public double getSpeed()
  {
    return speed;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setLocation(String location)
  {
    this.location = location;
  }

  public void setSuspect(String suspect)
  {
    this.suspect = suspect;
  }

  public void setWeapon(String weapon)
  {
    this.weapon = weapon;
  }

  public void setDate(LocalDate date)
  {
    this.date = date;
  }

  public void setTime(LocalTime time)
  {
    this.time = time;
  }

  public void setLatitude(double latitude)
  {
    this.latitude = latitude;
  }

  public void setLongitude(double longitude)
  {
    this.longitude = longitude;
  }

  public void setAltitude(double altitude)
  {
    this.altitude = altitude;
  }

  public void setSpeed(double speed)
  {
    this.speed = speed;
  }

  @Override public String toString()
  {
    return "Evidence{" + "description='" + description + '\'' + ", type='"
        + type + '\'' + ", location='" + location + '\'' + ", suspect='"
        + suspect + '\'' + ", weapon='" + weapon + '\'' + ", date=" + date
        + ", time=" + time + ", latitude=" + latitude + ", longitude="
        + longitude + ", altitude=" + altitude + ", speed=" + speed + '}';
  }
}
