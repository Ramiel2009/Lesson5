package lesson5_innerClass;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Ship {
    public class Engine{
        public void launch(){
            System.out.println("Start brrrrrrrr");
        }
    }

    public void init (){
        Engine eng = new Engine();;
        eng.launch();
    }
}
