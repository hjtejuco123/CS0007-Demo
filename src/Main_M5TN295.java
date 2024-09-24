/**
 *
 * @author hadjitejuco
 */
public class Main_M5TN295 {
    public static void main(String[] args) {
        M5_TN295 emp1 = new M5_TN295("Hadji", 1, 100.00);
        emp1.displayDetails();
        
        emp1.setName("James");
        //emp1.setId(2);
        emp1.setSalary(-1);
        
        emp1.displayDetails();
        
    }
}
