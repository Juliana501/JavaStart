import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try {
            int a = Integer.parseInt(input);
            int result = 0;
            int exponent = 0;
            int currentSymbol;
            while (a > 0) {
                currentSymbol = a % 10;
                if ((currentSymbol != 0 ) & (currentSymbol != 1)) {
                    throw new NumberFormatException();
                 }
                result += currentSymbol * Math.pow(2, exponent);
                exponent++;
                a = a / 10;
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Введи число в бинарном формате");
        }
    }

}
