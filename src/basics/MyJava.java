/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;


public class MyJava {
    
    public static void main(String[] args) {
    
        Car carDefault = new Car();
        
        Car carParam = new Car("bmw","789");
        
        Car carCopy = new Car(carDefault);
        
        Car car = new Car1();
        
        ///Car1 car1 = new Car();
    }
}
