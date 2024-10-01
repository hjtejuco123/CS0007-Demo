import java.util.Scanner;
public class MainEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Employee age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        
        Employee employee = new Employee(name, age, salary);
        employee.displayInfo();
        
    }
}
