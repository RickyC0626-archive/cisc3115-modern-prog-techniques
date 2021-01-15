import java.util.ArrayList;
import java.util.Random;

public class FruitClient
{
    public static void main(String[] arg)
    {
        ArrayList<String> fruits = new ArrayList<>();
        Random random = new Random();
        String fruit1, fruit2;

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Coconut");
        fruits.add("Grape");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Watermelon");

        for(int i = 0; i < fruits.size(); i++)
        {
          System.out.println(fruits.get(i));
        }

        fruit1 = fruits.get(random.nextInt(fruits.size()));
        fruit2 = fruits.get(random.nextInt(fruits.size()));

        Fruit f1 = new Fruit(fruit1);
        Fruit f2 = new Fruit(fruit2);

        System.out.printf("\nDoes %s equal to %s? ", fruit1, fruit2);
        System.out.println(f1.equal(f2));

        System.out.println("HashCode for " + fruit1 + ": " + f1.hashCode());
        System.out.println("HashCode for " + fruit2 + ": " + f2.hashCode());
    }
}
