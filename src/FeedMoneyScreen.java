import java.util.HashMap;
import java.util.Scanner;

public class FeedMoneyScreen {
    static double moneyInserted = 0;
    static int purchaseSelection;
    static double insertedMoney;

    public static void PurchaseScreen() {
            //printing out codes for purchase screen
            System.out.printf("Money inserted: $%.2f", moneyInserted);
            System.out.println("\n(1) Feed money");
            System.out.println("(2) Select product");
            System.out.println("(3) Finish transaction");
            //purchase flow
            Scanner input = new Scanner(System.in);
            purchaseSelection = input.nextInt();
    }
    public static void FeedMoney(){
        if (purchaseSelection == 1) {
            System.out.println("feed money");
            Scanner MoneyInserted = new Scanner(System.in);
            insertedMoney = MoneyInserted.nextInt();
            if (insertedMoney == 1 || insertedMoney == 5 || insertedMoney == 10 || insertedMoney == 20) {
                moneyInserted = moneyInserted + insertedMoney;
//                while(moneyInserted>0){
//                    PurchaseScreen();
//                    FeedMoney();
//                    Select();
//                    if (purchaseSelection==3){
//                        DispenseChange.Change();
//                        break;
//                    }
//                }
            }
        }
    }
    public static void Select(){
        if(purchaseSelection==2){
            DisplayItems.display();
            DispenseItems.Dispense();
        }
    }
}
