 
package interfaces;

 
public abstract class Animal {
    
    int legs;
    
    abstract void run();
    
    void showLegs(){
        System.out.println("Legs -> "+legs);
    }
}
