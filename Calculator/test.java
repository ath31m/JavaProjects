import java.util.Scanner;

public class test 
{   
    static char action;
    static String decision;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {   
        do
        {
            System.out.println("+\t-\t*\t/");
            action = scan.next().charAt(0);

            switch (action)
            {
                case '+': System.out.println("add"); break;
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
