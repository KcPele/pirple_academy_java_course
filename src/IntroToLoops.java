import java.util.Scanner;

public class IntroToLoops {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String password = "fidekg123";
        String pass;
        do {
            System.out.println("Whats the password: ");
            pass = reader.nextLine();
        } while (!pass.equals(password));
        String input;
        String all = "";
        do {
            input = reader.nextLine();
            all += input;

        } while(!input.equals("stop"));
        System.out.println(all);

    }
}
