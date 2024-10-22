
public class TN210_M7_3_Main {
    public static void main(String[] args) {
        TN210_M7_3 myAnimal = new TN210_M7_3();
        TN210_M7_3 myDog = new TN210_M7_3a();
        TN210_M7_3 myCat = new TN210_M7_3b();

        myAnimal.sound(); //sound from the parent class
        myDog.sound(); //sound from dog (override)
        myCat.sound(); //sound from cat (override)
    }
}
