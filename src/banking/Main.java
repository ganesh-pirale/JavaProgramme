 
package banking;

 
public class Main {
    
    public static void main(String[] args) {
        
        UbiAtm ubiAtm = new UbiAtm();
        System.out.println("Balance is - "+ubiAtm.balance("1000"));;
        ubiAtm.withdraw("100", 1500);
        ubiAtm.deposit("100", 10000);
        ubiAtm.goldLoan("1000",100);
        
        HdfcAtm hdfcAtm = new HdfcAtm();
        System.out.println("Balance is - "+hdfcAtm.balance("1000"));;
        hdfcAtm.withdraw("100", 1500);
        hdfcAtm.deposit("100", 10000);
        hdfcAtm.housingLoan("100", 89);
        
        CommanAtm atm = new CommanAtm();
        atm.swipe(hdfcAtm);   // void swipe(10);
        atm.swipe(ubiAtm);    // void swipe(20);  
    }
}
