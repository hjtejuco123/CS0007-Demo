/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadjitejuco
 */
public class Vehicle {
    protected String plateNumber;
    protected boolean isRented;

    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        this.isRented = false;
    }

    public void rentVehicle() {
        if (!isRented) {
            isRented = true;
            System.out.println(plateNumber + " has been rented.");
        } else {
            System.out.println(plateNumber + " is already rented.");
        }
    }

    public void returnVehicle() {
        isRented = false;
        System.out.println(plateNumber + " has been returned.");
    }

    public void displayInfo() {
        System.out.println("Plate Number: " + plateNumber + ", Rented: " + isRented);
    }
}
