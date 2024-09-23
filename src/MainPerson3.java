/**
 *
 * @author hadjitejuco
 */
public class MainPerson3 {
    public static void main(String[] args) {
        //create object
        Person3 pers1 = new Person3(); //default constructor
        Person3 pers2 = new Person3("Hadji"); //1 parameter
        Person3 pers3 = new Person3("Joan",20);//2 parameter
        
        pers1.displayDetails();
        pers2.displayDetails();
        pers3.displayDetails();
        
        
    }
}
