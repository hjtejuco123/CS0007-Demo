/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadjitejuco
 */
abstract class Vehicle {
    String brand;
    
    Vehicle(String brand){
        this.brand = brand;
    }
    
    abstract void honk();
}
