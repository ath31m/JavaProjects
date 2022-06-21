import java.util.Scanner;

public class HotelBooking
{
    static String customerName;
    static int roomType;
    static int roomStandard;
    static String typeOutput;
    static String standardOutput;
    static int numberOfRooms;
    static int costType;
    static int costStandard;
    static int totalCost;
    static char decision;
    static Scanner input = new Scanner(System.in);

    public static void main(String[]args)
    {
        System.out.println("\n"+"=== Welcome to Hotel California ===");   

        line();

        System.out.print("=== Plz, Enter your name === \n");
        customerName = input.nextLine();

        line();
        
        do
        {
            type();
        
            input.nextLine();
            line();

            standard();

            input.nextLine();
            line();

            number();
            line();

            System.out.println("Order Confirmation: Y/N ???");
            decision = input.next().charAt(0);

        } while(decision != 'Y'); // while(decision.equals('Y'))

        receipt();
    }


    public static void type()
    {
        do
        {
            System.out.println("=== Plz, choose room type ===");
            System.out.println(" 1: Sea View Suite, $500 ");
            System.out.println(" 2: Sea View with Pool, $400 ");
            System.out.println(" 3: Sea View, $300 ");
            System.out.println(" 4: Garden View, $200 ");
            System.out.println(" 5: Budget Room, $100 ");
            roomType = input.nextInt();

            switch(roomType)
            {
                case 1: costType = 500; typeOutput = "Sea View Suite"; break;
                case 2: costType = 400; typeOutput = "Sea View with Pool"; break;
                case 3: costType = 300; typeOutput = "Sea View"; break;
                case 4: costType = 200; typeOutput = "Garden View"; break;
                case 5: costType = 100; typeOutput = "Budget Room"; break;
                default: System.out.println("Invalid room type\n");
            }
        } while(roomType>5);
    }

    public static void standard()
    {
        do
        {
            System.out.println("=== Plz, choose room standard ===" + "\n" + "=== Costs will be add-ons ===");
            System.out.println(" 1: King Size = + $300 ");
            System.out.println(" 2: Queen Size = + $200 ");
            System.out.println(" 3: Single-Bedroom = + $100 ");
            System.out.println(" 4: Double-Bedroom = + $200 ");
            System.out.println(" 5: Squad-Bedroom = + $300 ");
            roomStandard = input.nextInt();

            switch(roomStandard)
            {
                case 1: costStandard = 300; standardOutput = "King Size"; break;
                case 2: costStandard = 200; standardOutput = "Queen Size"; break;
                case 3: costStandard = 100; standardOutput = "Single-Bedroom"; break;
                case 4: costStandard = 200; standardOutput = "Double-Bedroom"; break;
                case 5: costStandard = 300; standardOutput = "Squad-Bedroom"; break;
                default: System.out.println("Invalid room Standard\n");
            }
        } while(roomStandard>5);
    }

    public static void number()
    {
        do
        {
            System.out.println("=== Plz, choose number of rooms ===");
            System.out.println("1: 2: 3: 4: 5: 6: 7: 8: 9: 10 ");
            numberOfRooms = input.nextInt();
        } while(numberOfRooms>10);
    }

    public static void line()
    {
        for (int i=0; i<60; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void line2()
    {
        for (int i=0; i<130; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void receipt()
    {
        totalCost = (costType + costStandard) * numberOfRooms ;

        line2();
        System.out.println("\t=== Welcome to Hotel California ==="); 
        System.out.println( "\tCustomer Name" + "\tRoom Type" + "\t\tRoom Standard" + "\t\tNumber of Rooms" + "\t\tTotal Cost");
        System.out.println( "\t"+customerName +"\t"+ typeOutput +"\t\t"+ standardOutput +"\t\t"+ numberOfRooms + "\t\t\t$ " + totalCost);
        line2();
    }

}