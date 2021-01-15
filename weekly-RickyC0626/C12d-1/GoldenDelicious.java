import java.util.Objects;

public final class GoldenDelicious extends Apple
{
  private String name = "";

  public String toString()
  {
      return ("GoldenDelicious: " + name);
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
