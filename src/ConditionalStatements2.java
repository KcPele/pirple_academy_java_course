import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input now: ");
        String input = reader.next();
        System.out.println(input);
        String password = "password";
        if(input.equals(password)) System.out.println("Yes");
        else System.out.println("No");


    }
}
