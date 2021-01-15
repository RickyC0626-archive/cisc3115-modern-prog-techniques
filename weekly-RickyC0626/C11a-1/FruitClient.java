public class FruitClient
{
    public static void main(String[] arg)
    {
        //Runtime Polymorphism Example
        Fruit f1 = new Apple(); //Create new Fruit object in the form of an Apple
        Fruit f2 = new Orange(); //Create new Fruit object in the form of an Orange
        Apple a1 = new GoldenDelicious(); //Create new Apple object in the form of GoldenDelicious
        Apple a2 = new McIntosh(); //Create new Apple object in the form of McIntosh
        //This is an example of polymorphism because Fruit and Apple can take on many forms

        System.out.println("\nPolymorphism and Dynamic Binding Examples\n");

        //Dynamic Binding Example
        System.out.println(f1.toString()); //Access the toString() method via f1 reference to Apple object
        System.out.println(f2.toString()); //Access the toString() method via f2 reference to Orange object
        System.out.println(a1.toString()); //Access the toString() method via a1 reference to GoldenDelicious object
        System.out.println(a2.toString()); //Access the toString() method via a2 reference to McIntosh object
        //Polymorphism shows that there are different ways to do the same action
        //Dynamic Binding shows that the overriden method is determined by the object that is being used
        //This is called dynamic binding because the overriden method is determined at runtime

        System.out.println("\nUpcasting Example\n");

        //Upcasting Example
        Apple apple = new Apple(); //Create new Apple object
        Fruit fruit = (Fruit) apple; //Convert subtype to supertype upward the inheritance tree
        //Reference type is changed from apple to fruit
        System.out.println(fruit.toString()); //Access the toString() method via fruit reference to Apple object

        System.out.println("\nDowncasting Example\n");

        //Downcasting example
        Fruit newFruit = new Orange(); //There's a new fruit that you see
        //Check object type before casting
        if(newFruit instanceof Orange) //If your brain recognizes an orange
        {
          Orange newOrange = (Orange) newFruit;
          System.out.println(newOrange.toString()); //Say that the fruit you see is an orange
        }
        else if(newFruit instanceof Apple) //If your brain recognizes an apple
        {
          Apple newApple = (Apple) newFruit;
          System.out.println(newApple.toString()); //Say that the fruit you see is an apple
        }
    }
}
