import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        String[] allName = {
                "jane","Joe",
                "filip","john",
                "comrage","Titi",
                "Mohammed","Abdulahi"
        };
        String[] firstName = new String[allName.length/2];
        String[] lastName = new String[allName.length/2];
        for (int i = 0; i < allName.length; i++){
            if(i % 2 == 0){
                firstName[i/2] = allName[i];
            } else  {
                lastName[i/2] = allName[i];
            }
        }
       Map<String, String> famousPeople = new HashMap<>();
        for(int i = 0; i < lastName.length; i++){
            famousPeople.put(lastName[i],firstName[i]);
        }
        System.out.println(famousPeople.get("john"));

    }
}
