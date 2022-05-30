import java.util.Scanner;

public class Calculator 
{   
    static int num1;
    static int num2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
        {
            System.out.println("--- Calculator---");

            System.out.print("Plz, Enter first number: ");
            num1 = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Plz, Enter first number: ");
            num2 = scanner.nextInt();

            System.out.println(num1+num2);
        }
}