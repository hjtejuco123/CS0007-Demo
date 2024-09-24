/**
 *
 * @author hadjitejuco
 */
public class Main_M5TN285 {
    public static void main(String[] args) {
        M5_TN285 emp = new M5_TN285("Hadji",101,-100);
        
        emp.displayDetails();
        
        emp.setName("James");
        emp.setSalary(-100);
        
        System.out.println("Updated Name is: "+emp.getName());
        System.out.println("Updated Salary is: "+emp.getSalary());

        emp.displayDetails();
    }
}
