//<<<<<<< HEAD
//package banking;
//
//public class CommanAtm {
//
//    void swipe(Bankable panty) /* it is very similar to int i parameter */ //void swipe(int i);
//    {
//        System.out.println(" Balance - " + panty.balance("100"));;
//=======
 
package banking;

public class CommanAtm {
    
    void swipe(Bankable panty)              /* it is very similar to int i parameter */    //void swipe(int i);
        {
        System.out.println(" Balance - "+panty.balance("100"));;
//>>>>>>> origin/master
        panty.deposit("100", 4531);
        panty.withdraw("45", 12);
    }
}
