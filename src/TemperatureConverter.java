import java.util.Scanner;

public class TemperatureConverter {
    public static  void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char inputType;
        char outputType;
        float inputValue;
        float returnValue;

        System.out.print("Input type (F/C/K): ");
        inputType = reader.next().charAt(0);
        System.out.println("Output type (F/C/K): ");
        outputType = reader.next().charAt(0);
        System.out.println("Temperature");
        inputValue = reader.nextFloat();

        switch (inputType) {
            case 'F':
                inputValue = fToC(inputValue);
                break;
            case 'C':
                break;
            case 'K':
                inputValue = fToC(kToF(inputValue));
            default:
                System.exit(1);
        }
        switch (outputType) {
            case 'F':
                inputValue = kToF(cToK(inputValue));
                break;
            case 'C':
                break;
            case 'K':
                inputValue = cToK(inputValue);
            default:
                System.exit(1);
        }
        System.out.println(inputValue);
    }

    public static float fToC(float fval){
        return ((fval-32.0f)*5.0f) / 9.0f;
    }
    public static float kToF(float kval){
        return (((kval - 273.15f)*9.0f)/5.0f)+32.0f;
    }
    public static float cToK(float cval){
        return cval + 273.15f;
    }
}
