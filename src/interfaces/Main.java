/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Ganesh
 */
public class Main {
    public static void main(String[] args) {
        
        Human human = new Human();
        System.out.println("Location Of Human - "+human.getLocation());
        
        Car car = new Car();
        System.out.println("Location Of Car - "+car.getLocation());
        
        GpsListener listener = new Human();
        System.out.println("Human Location - "+listener.getLocation());;
        
        Locator locator = new Locator();
        locator.locateAnyThing(car);
        locator.locateAnyThing(human);
        locator.locateAnyThing(listener);
    }
}
