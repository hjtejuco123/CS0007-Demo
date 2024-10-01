
import java.util.Scanner;
public class MainRentalSystem {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int numCars = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        Car1[] cars = new Car1[numCars];

        for (int i = 0; i < numCars; i++) {
            System.out.print("Enter car plate number: ");
            String plateNumber = scanner.nextLine();

            System.out.print("Enter number of doors: ");
            int numberOfDoors = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            cars[i] = new Car1(plateNumber, numberOfDoors);
        }

        System.out.println("\nCar Details:");
        for (Car1 car : cars) {
            car.displayInfo();
        }

        // Simulate renting a car
        cars[0].rentVehicle();

        // Display info after renting
        cars[0].displayInfo();

        scanner.close();
    } 
}
