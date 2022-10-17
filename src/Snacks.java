public class Snacks {
    String name;
    double price;
    int counter=5;
    String message;

    public Snacks(String name, double price, String message) {
        this.name = name;
        this.price = price;
        this.message = message;
    }

    public String toString() {
        if (FeedMoneyScreen.moneyInserted >= price) {
            FeedMoneyScreen.moneyInserted = FeedMoneyScreen.moneyInserted - price;
        }
        return name + " " + "$" + price + " " + message + " " + "stock:"+this.counter;
    }

    public int decreaseCount() {
        System.out.println("current count ="+ this.counter);
        if(this.counter>0){
            this.counter--;
            System.out.println("current count ="+ this.counter);
        }
        return this.counter;
    }
}
