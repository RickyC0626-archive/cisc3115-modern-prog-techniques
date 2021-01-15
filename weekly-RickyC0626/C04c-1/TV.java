import java.util.Date;

public class TV
{
  private static int count = 0;
  private String manufacturingDate = "";

  Date date = new Date();

  int channel = 1;
  int volumeLevel = 1;
  boolean on = false;

  public TV()
  {
    count++;
    manufacturingDate = date.toString();

    System.out.println("Count: " + count);
    System.out.println("Manufacturing Date: " + manufacturingDate);
  }

  public void turnOn()
  {
    on = true;
  }

  public void turnOff()
  {
    on = false;
  }

  public void setChannel(int newChannel)
  {
    if(on && newChannel >= 1 && newChannel <= 120)
      channel = newChannel;
  }

  public void setVolume(int newVolumeLevel)
  {
    if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
      volumeLevel = newVolumeLevel;
  }

  public void channelUp()
  {
    if(on && channel < 120)
      channel++;
  }

  public void channelDown()
  {
    if(on && channel > 1)
      channel--;
  }

  public void volumeUp()
  {
    if(on && volumeLevel < 7)
      volumeLevel++;
  }

  public void volumeDown()
  {
    if(on && volumeLevel > 1)
      volumeLevel--;
  }
}
