import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        OpenScreen.OpenScreen();

        if(OpenScreen.menu==1){
            DisplayItems.display();
            OpenScreen.OpenScreen();
            FeedMoneyScreen.PurchaseScreen();
            FeedMoneyScreen.FeedMoney();
            FeedMoneyScreen.Select();
        }
        if(OpenScreen.menu==2){
            while(FeedMoneyScreen.moneyInserted>=0) {
                FeedMoneyScreen.PurchaseScreen();
                FeedMoneyScreen.FeedMoney();
                FeedMoneyScreen.Select();
                if(FeedMoneyScreen.purchaseSelection==3){
                    DispenseChange.Change();
                    break;
                }
            }
        }
    }
}

