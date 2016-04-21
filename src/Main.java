
public class Main extends DeshiBanana{
    
    public static void main(String[] args) {
        
        Main main = new Main();
        main.fromWhichPlace();
        
        System.out.println(main instanceof DeshiBanana);
        System.out.println(main instanceof Main);
        
        Banana ban = new Banana();
        ban.getBananaType();
        
        Banana banana = new DeshiBanana();
        //DeshiBanana deshiBanana = new Banana();
        //banana.fromWhichPlace();  // ***how to access Deshi and Vasai methods thru Banana as instanceOf
        //operator is used here
//        deshiBanana.eatBanana();
//        DeshiBanana deshiBanana = (DeshiBanana)new Banana();
        
//        VasaiBanana vasaiBanana = new VasaiBanana();
//        vasaiBanana.eatBanana();
//        ban.eatBanana();
        
        Temp temp = new Temp();
        temp.cutBanana(banana);
        
    }
}
