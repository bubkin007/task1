import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        int incVal = inputValue + (inputValue / 100)*15;
        System.out.println(incVal);
    }
}
