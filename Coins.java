public class Coins {
    public static void main(String args[]) {
        // add amount of cents
            int money = Integer.parseInt(args[0]);
            int quarters = money/25;
            int cents = money%25;
            // prints the summerise of qurters and cents needed
            System.out.println("use "+quarters+" quarterts and "+cents+" cents" );
}
       
    
}