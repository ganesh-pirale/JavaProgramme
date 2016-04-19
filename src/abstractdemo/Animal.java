
package abstractdemo;

 
public /*abstract*/ class Animal extends Entity{
    
    int legs;
    int eyes;
    
    void blinkEyes(){
        eyes = 0;
    }
    
    void runFast(){
        legs = legs +3;
    }

    @Override
    String giveMeType() {
        return "Animal";
    }
}
