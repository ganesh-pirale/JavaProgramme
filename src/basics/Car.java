package basics;

public class Car {

    public String carName;
    public String number;

    public Car() { // default constructor 
        carName = "audi";
        number = "123";
    }
    
    public Car(String nm,String num){
        carName = nm;
        number = num;
    }
    
    public Car(Car car){
        carName= car.carName;
        number = car.number;
    }
    
    void  speedUp(int speed){
        
    }
    
    int speedUp(double speed) {
        
        return 1;
    }
}  
