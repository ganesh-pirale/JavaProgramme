 
package abstractdemo;

 
public class Car extends Entity{
    
    int rpm;
    int lights;
    
    void applyBreaks(){
        
        rpm = rpm - 1;
    }
    void showLights(){
        lights = 1;
    }
    
    @Override
    String giveMeType() {
        return "Car";
    }
}