import java.util.Scanner;

public class test 
{   
    static int num1;
    static int num2;
    static char action;
    static String decision;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {   
        do
        {
            System.out.print("Plz, Enter first number: ");
            num1 = scan.nextInt();

            scan.nextLine();

            System.out.print("Plz, Enter second number: ");
            num2 = scan.nextInt(); 

            System.out.println("+\t-\t*\t/");
            action = scan.next().charAt(0);

            switch (action)
            {
                case '+': System.out.println(num1+num2); break;
                case '-': System.out.println("minus"); break;
                case '*': System.out.println("into"); break;
                case '/': System.out.println("by"); break;
                default: System.out.println("Invalid Operator!!!"); break;
            }

            System.out.println("Calculate again, Y/N?");
            action = scan.next().charAt(0);
            
        } while ( action != 'N');
    }
}
