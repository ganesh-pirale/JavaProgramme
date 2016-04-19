 
package abstractdemo;

 
public class Main {
    
    public static void main(String[] args) {
        
        /*Entity entity = new Entity();
        System.out.println("Type -> "+entity.giveMeType());*/
        
        Car car = new  Car();
        System.out.println("Type ->"+car.giveMeType());;
        Animal animal = new Animal();
        System.out.println("Type ->"+animal.giveMeType());;
        
        Entity enCar = new Car();
        System.out.println("Type ->"+enCar.giveMeType());
        Entity enAnimal = new Animal();
        System.out.println("Type ->"+enAnimal.giveMeType());;
        //----------------
        Utility utility = new Utility();
        
        utility.showOnMap(car);
        utility.showOnMap(animal);
        
        utility.showOnMap(enCar);
        utility.showOnMap(enAnimal);
        
    }
}
