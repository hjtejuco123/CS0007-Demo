/**
 * Main calling program
 * @author hadjitejuco
 */
public class MainM5_TN283 {
    public static void main(String[] args) {
        //create Car object using the constructor
        M5_TN283 car1 = new M5_TN283("Toyota","Corolla",2022);
        M5_TN283 car2 = new M5_TN283("Honda","Civic",1996);
        car1.displayDetails();
        car2.displayDetails();

    }
}
