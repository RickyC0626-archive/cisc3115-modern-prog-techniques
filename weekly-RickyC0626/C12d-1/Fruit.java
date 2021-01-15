import java.util.Objects;

public class Fruit
{
  private String name = "";

  public Fruit(String s)
  {
      name = s;
  }

  public String toString()
  {
      return ("Fruit: " + name);
  }

  public boolean equal(Object obj)
  {
      return this.hashCode() == obj.hashCode();
  }

  public int hashCode()
  {
      return Objects.hash(name);
  }
}
