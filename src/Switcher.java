import java.util.Scanner;

public class Switcher {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x = reader.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("green");
                break;
            default:
                System.out.println("None");
        }

    }
}
