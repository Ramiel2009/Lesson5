package lesson5_AnnonymClass;

/**
 * Created by Maxim on 31.07.2015.
 */
public class Main {
    public static void main (String [] args){
        TypeQuest un = new TypeQuest(){
            public void addNewType(){
                System.out.println("Added question with free answer");
            }
        };
        un.addNewType();
        new TypeQuest(71){
        private String name = "Drag&Drop";

            public void addNewType(){
                System.out.println("Added "+getName());
            }
            String getName(){
                return name;
            }
        }.addNewType();
        TypeQuest standart = new TypeQuest();
        standart.addNewType();
    }

}
