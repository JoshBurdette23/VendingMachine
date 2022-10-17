import java.util.Scanner;

public class OpenScreen {
    static int menu;
    public static void OpenScreen() {
        System.out.println("(1) Display items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");

        Scanner input = new Scanner(System.in);
        menu = input.nextInt();
    }
}
