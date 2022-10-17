public class Candy extends Snacks{
    public Candy(String name,double price,String message){
        super(name, price,message);
    }

    public static String message(){
        String beverageMessage = "munch munch yum";
        System.out.println(beverageMessage);
        return beverageMessage;
    }

}
