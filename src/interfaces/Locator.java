
package interfaces;

public class Locator {
    
    void locateAnyThing(GpsListener listener){
        System.out.println("Location from locator - "+listener.getLocation());
    }
}
