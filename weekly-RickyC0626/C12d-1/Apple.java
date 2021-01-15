import java.util.Objects;

public class Apple extends Fruit
{
  private String name = "";

  public String toString()
  {
      return ("Apple: " + name);
  }

  public String getApplePieRecipe()
  {
      return "Apples, Sugar, and other stuff";
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
