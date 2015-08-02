package lesson5_NestedClass;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Main {
    public void main(String args[]){
        Ship.LifeBoat.down();
        Ship.LifeBoat ls = new Ship.LifeBoat();
        ls.swim();
    }
}
