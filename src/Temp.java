
public class Temp  {

    void getTemp(/*int controller = 10*/int controller) {
        Banana banana = new Banana();
        Banana banana1 = new DeshiBanana();
        cutBanana(banana);
    }

    void callTemp() {
        int tmp = 20;
        getTemp(tmp);
    }
    void cutBanana(/*Banana ban = */Banana ban) {
        //ban.getBananaType();
        int type = ban.getBananaType();
        //System.out.println(" "+ban.getBananaType());
        System.out.println(""+type);
//        ban.getBananaType(); 
        
        

        if (ban instanceof DeshiBanana) {    // it is used to test whether object (ban) is an instance of 
            //the specified "user defined" type (DeshiBanana)
            DeshiBanana deshiBanana =  (DeshiBanana) ban;
            deshiBanana.fromWhichPlace();
            ((DeshiBanana) ban).fromWhichPlace();
            //ban.fromWhichPlace();     // showing error 
            System.out.println("Temp.cutBanana()");
        }
        
        if (ban instanceof VasaiBanana) {

            VasaiBanana vasaiBanana = (VasaiBanana) ban;
            vasaiBanana.countVasai();
        }
    }

    void gandvane() {
        /*Banana banana = new Banana();
        cutBanana(banana);*/

        DeshiBanana deshiBanana = new DeshiBanana();
        cutBanana(deshiBanana);

        Banana deshi = new DeshiBanana();
        cutBanana(deshi);

        VasaiBanana vasaiBanan = new VasaiBanana();
        cutBanana(vasaiBanan);

        /*DeshiBanana deBan = new Banana();
        cutBanana(deBan)*/
 /*Banana deshiBanana = new Banana();
        cutBanana(deshiBanana);*/
    }
}
