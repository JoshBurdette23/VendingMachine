public class DisplayItems {
    public static void display(){
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


        System.out.println("A1 "+sprite.name+" "+sprite.price);
        System.out.println("A2 "+coke.name+" "+coke.price);
        System.out.println("A3 "+pepsi.name+" "+pepsi.price);
        System.out.println("A4 "+fanta.name+" "+fanta.price);
        System.out.println("A5 "+drPepper.name+" "+drPepper.price);

        System.out.println("b1 "+snickers.name+" "+snickers.price);
        System.out.println("b2 "+skittles.name+" "+skittles.price);
        System.out.println("b3 "+twix.name+" "+twix.price);
        System.out.println("b4 "+sourPatchKids.name+" "+sourPatchKids.price);
        System.out.println("b5 "+reeses.name+" "+reeses.price);

        System.out.println("c1 "+lays.name+" "+lays.price);
        System.out.println("c2 "+pringles.name+" "+pringles.price);
        System.out.println("c3 "+doritos.name+" "+doritos.price);
        System.out.println("c4 "+fritos.name+" "+fritos.price);
        System.out.println("c5 "+cheetos.name+" "+cheetos.price);

        System.out.println("d1 "+juicyFruit.name+" "+juicyFruit.price);
        System.out.println("d2 "+fiveGum.name+" "+fiveGum.price);
        System.out.println("d3 "+extra.name+" "+extra.price);
        System.out.println("d4 "+trident.name+" "+trident.price);
        System.out.println("d5 "+stride.name+" "+stride.price);

    }
}
