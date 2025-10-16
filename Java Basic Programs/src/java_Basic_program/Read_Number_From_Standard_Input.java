package java_Basic_program;
import java.util.Scanner;
public class Read_Number_From_Standard_Input {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Scanner.nextInt();
        System.out.println("You entered: " + number);
    }
}
