import javax.management.ObjectName;
import java.io.ObjectInput;
import java.rmi.server.ObjID;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class DispenseItems {
    //static double change;

    public static void Dispense(){
        Beverages sprite = new Beverages("sprite",1.99,"glug glug yum");
        Beverages coke = new Beverages("coke",2.25,"glug glug yum");
        Beverages pepsi=new Beverages("pepsi",1.75,"glug glug yum");
        Beverages fanta=new Beverages("fanta",2.00,"glug glug yum");
        Beverages drPepper=new Beverages("dr pepper",2.25,"glug glug yum");

        Candy snickers = new Candy("snicker",2.75,"munch munch yum");
        Candy skittles = new Candy("skittles",2.50,"munch munch yum");
        Candy twix = new Candy("twix",1.75,"munch munch yum");
        Candy sourPatchKids = new Candy("sour patch kids",2.25,"munch munch yum");
        Candy reeses = new Candy("reeses",1.50,"munch munch yum");

        Chips lays = new Chips("lays",2.50,"crunch crunch yum");
        Chips pringles = new Chips("pringles",1.75,"crunch crunch yum");
        Chips doritos = new Chips("doritos",2.25,"crunch crunch yum");
        Chips fritos = new Chips("fritos",1.50,"crunch crunch yum");
        Chips cheetos = new Chips("cheetos",2.00,"crunch crunch yum");

        Gum juicyFruit = new Gum("juicy fruit",0.75,"chew chew yum");
        Gum fiveGum = new Gum("five gum",0.50,"chew chew yum");
        Gum extra = new Gum("extra",0.75,"chew chew yum");
        Gum trident = new Gum("trident",0.75,"chew chew yum");
        Gum stride = new Gum("stride",0.25,"chew chew yum");

        HashMap<String, Snacks> snackIds = new HashMap<>();
        snackIds.put("a1",sprite);
        snackIds.put("a2",coke);
        snackIds.put("a3",pepsi);
        snackIds.put("a4",fanta);
        snackIds.put("a5",drPepper);

        snackIds.put("b1",snickers);
        snackIds.put("b2",skittles);
        snackIds.put("b3",twix);
        snackIds.put("b4",sourPatchKids);
        snackIds.put("b5",reeses);

        snackIds.put("c1",lays);
        snackIds.put("c2",pringles);
        snackIds.put("c3",doritos);
        snackIds.put("c4",fritos);
        snackIds.put("c5",cheetos);

        snackIds.put("d1",juicyFruit);
        snackIds.put("d2",fiveGum);
        snackIds.put("d3",extra);
        snackIds.put("d4",trident);
        snackIds.put("d5",stride);


        System.out.printf("Money Inserted: $%.2f", FeedMoneyScreen.moneyInserted);
        System.out.println("\nSelect product");

        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        boolean selection;
        selection = snackIds.containsKey(key);

        if(selection==true){
            Snacks snack = (Snacks) snackIds.get(key);
            snack.decreaseCount();
            snackIds.put(key,snack);
            System.out.println(snackIds.get(key));
        }

        if(selection==false){
            System.out.println("error");
        }



    }
}
