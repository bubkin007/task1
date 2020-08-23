import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        float TC = input.nextInt();
        float  TF  = (float)(1.8* TC + 32);
        System.out.println(TF );
    }
}
