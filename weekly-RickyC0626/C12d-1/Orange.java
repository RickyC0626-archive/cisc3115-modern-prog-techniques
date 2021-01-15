import java.util.Objects;

public class Orange extends Fruit
{
  private String name = "";

  public String toString()
  {
      return ("Orange: " + name);
  }

  public String getOrangeJuiceRecipe()
  {
      return "Squeeze the oranges";
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
