public class Gum extends Snacks{
    public Gum(String name,double price,String message){
        super(name, price,message);
    }

    public static String message(){
        String beverageMessage = "chew chew yum";
        System.out.println(beverageMessage);
        return beverageMessage;
    }
}
