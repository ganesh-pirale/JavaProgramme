
public class Banana {

    int bananaType;

    public Banana() {
        bananaType = 123;
    }

    public int getBananaType() {
        System.out.println("Banana.getBananaType()");
        return bananaType;
        //System.out.println(" "+bananaType);
    }

    void eatBanana() {
        System.out.println("Ate banana");

    }

}
