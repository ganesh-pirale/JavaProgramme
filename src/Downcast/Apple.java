 
package Downcast;
 
public class Apple extends Fruit{
    
    void MyFruit(Fruit f){
    
        if(f instanceof Apple){
            Apple a = (Apple)f;
        }
        
    } 
}
