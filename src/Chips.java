public class Chips extends Snacks{
    public Chips(String name,double price,String message){
        super(name, price,message);
    }

    public static String message(){
        String beverageMessage = "crunch crunch yum";
        System.out.println(beverageMessage);
        return beverageMessage;
    }
}
