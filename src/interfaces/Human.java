 
package interfaces;

 
public class Human implements GpsListener{
    
    @Override
    public String getLocation() 
    {
        //GPS_DEVICE = 12; not possible
        return "Gate";
    }
}

