package thur.coinconverter;

/**
 *
 * @author john
 */
public class ThurCoinConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalPennies = 1017;
        
        int totalQuarters = totalPennies / 25;
        
        int quarterRemainder = totalPennies % 25;
        
        int totalDimes = quarterRemainder / 10;
        
        int dimeRemainder = quarterRemainder % 10;
        
        int totalNickles = dimeRemainder / 5;
        
        int finalPennies = dimeRemainder % 5;
        
        System.out.println("Total Pennies: " + totalPennies);
        System.out.println("Total Quarters: " + totalQuarters);
        System.out.println("Total Dimes: " + totalDimes);
        System.out.println("Total Nickles: " + totalNickles);
        System.out.println("Final Pennies: " + finalPennies);
    }
    
}
