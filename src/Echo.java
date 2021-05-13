import java.util.ArrayList;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();
        boolean run = true;
        while (run) {
            String input = reader.nextLine();
            if(input.equals("quite")) {
                run = false;
            }
            memory.add(input);
            if((memory.get(memory.size() - 1)).equals("clear")){
                memory.clear();
            };


            System.out.println(memory.toString());
        }
    }
}
