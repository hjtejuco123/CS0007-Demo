/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadjitejuco
 */
public class ElectronicProduct extends Product {
    private int warrantyYears;

    public ElectronicProduct(String name, double price, int stock, int warrantyYears) {
        super(name, price, stock);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

