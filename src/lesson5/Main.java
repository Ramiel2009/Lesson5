package lesson5;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Main {
    public static void main (String args[]){
    Rectangle observed = new Rectangle(5.8, 3.7);
        System.out.println(observed.toString());

        observed.addObserver(new Square());
        observed.addObserver(new Perimeter());

        observed.setWidth(18.3);
        System.out.println(observed.toString());
        observed.setHeight(8.7);
    }
}
