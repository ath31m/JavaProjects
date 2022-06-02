import java.util.Scanner;

public class Calculator 
{   
    static double num1;
    static double num2;
    static char operator;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
        {   
            System.out.println("\n"+"--- Calculator---"+"\n");

            line();

            do
            {
                System.out.print("Plz, Enter first number: ");
                num1 = input.nextDouble();

                input.nextLine();

                System.out.print("Plz, Enter second number: ");
                num2 = input.nextDouble();

                System.out.println("Plz, Choose operator:\t+\t-\t*\t/\t");
                operator = input.next().charAt(0);

                switch(operator)
                {
                    case '+' : addition(); break;
                    case '-' : subtraction(); break;
                    case '*' : multiplication(); break;
                    case '/' : division(); break;
                    default: System.out.println("Invalid Operator!"); break;
                }
                
                line();
                System.out.println("Calculate again:  Y/N ???");
                operator = input.next().charAt(0);

            } while ( operator != 'N');
        }

    public static void addition()
    {
        System.out.println("The answer is: "+"( "+num1+" "+operator+" "+num2+" )"+"\t=  "+(num1+num2)+" .");
    }

    public static void subtraction()
    {
        System.out.println("The answer is: "+"( "+num1+" "+operator+" "+num2+" )"+"\t=  "+(num1-num2)+" .");
    }

    public static void multiplication()
    {
        System.out.println("The answer is: "+"( "+num1+" "+operator+" "+num2+" )"+"\t=  "+(num1*num2)+" .");
    }

    public static void division()
    {
        if (num2 != 0)
        {
            System.out.println("The answer is: "+"( "+num1+" "+operator+" "+num2+" )"+"\t=  "+(num1/num2)+" .");
        }
        else
        {
            System.out.println("any number is not divisible by 0 .");
        }
    }

    public static void line()
    {
        for (int i=0; i<=60; i++)
        {
            System.out.print("=");
        }
        System.out.print("\n");
    }
}

// git testing