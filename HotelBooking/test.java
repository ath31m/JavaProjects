import java.util.Scanner;

public class test
{
    static String customerName;
    static int roomType;
    static int roomStandard;
    static int numberOfRooms;
    static int costType;
    static int costStandard;
    static Scanner input = new Scanner(System.in);

    public static void main(String[]args)
    {
        System.out.println("\n"+"=== Welcome to Hotel California ==="+"\n");   

        line();

        System.out.print("=== Plz, Enter your name === \n");
        customerName = input.nextLine();

        line();
        input.nextLine();

        System.out.println("=== Plz, choose room type ===");
        System.out.println(" 1: Sea View Suite, $500 ");
        System.out.println(" 2: Sea View with Pool, $400 ");
        System.out.println(" 3: Sea View, $300 ");
        System.out.println(" 4: Garden View, $200 ");
        System.out.println(" 5: Budget, $100 ");
        roomType = input.nextInt();

        switch(roomType)
        {
            case 1: costType = 500; break;
            case 2: costType = 400; break;
            case 3: costType = 300; break;
            case 4: costType = 200; break;
            case 5: costType = 100; break;
            default: System.out.print("Invalid room type");
        }
        
        input.nextLine();
        line();

        System.out.println("=== Plz, choose number of rooms ===");
        System.out.println("1: 2: 3: 4: 5: 6: 7: 8: 9: 10 ");
        numberOfRooms = input.nextInt();

        calculation();
        
    }


    public static void calculation()
    {
        System.out.print("The cost is: " + (costType * numberOfRooms));
    }

    public static void line()
    {
        for (int i=0; i<60; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
    }

}
