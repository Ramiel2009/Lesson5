package lesson5_NestedClass;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Ship {
    private int ls;
    public static class LifeBoat{
        public static void down(){
            System.out.println("boat on the water");
        }

        public void swim(){
            System.out.println("swim");
        }
    }
}
