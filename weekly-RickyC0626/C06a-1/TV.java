import java.util.Date;

public class TV
{
  private Date date = new Date();

  private static int count = 0;
  private String manufacturingDate = "";

  private int channel = 1;
  private int volumeLevel = 1;
  private boolean on = false;

  public TV()
  {
    count++;
    manufacturingDate = date.toString();
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

  public int getChannel()
  {
    return channel;
  }

  public int getVolumeLevel()
  {
    return volumeLevel;
  }

  public String getManufacturingDate()
  {
    return manufacturingDate;
  }
}
