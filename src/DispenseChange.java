public class DispenseChange {
    static double money = FeedMoneyScreen.moneyInserted;
    public static void Change() {
        if(money>=0){
            double change = Math.round(money*100);

            int dollars=0;
            int quarters=0;
            int dime=0;
            int nickel=0;
            int pennies=0;

            while(change-100>=0){
                change=change-100;
                dollars++;
            }
            while(change-25>=0){
                change=change-25;
                quarters++;
            }
            while(change-10>=0){
                change=change-10;
                dime++;
            }
            while(change-5>=0){
                change=change-5;
                nickel++;
            }
            while(change-1>=0){
                change=change-1;
                pennies++;
            }

            System.out.println("Dollars: "+dollars);
            System.out.println("Quarters: "+quarters);
            System.out.println("dimes: "+dime);
            System.out.println("nickels: "+nickel);
            System.out.println("Pennies: "+pennies);
        }
    }
}
