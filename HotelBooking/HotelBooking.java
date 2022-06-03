import java.util.Scanner;

public class HotelBooking
{
    static String customerName;
    static int roomType;
    static int roomStandard;
    static int numberOfRooms;
    static int costType;
    static int costStandard;
    static int totalCost;
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

        System.out.println("=== Plz, choose room standard ===" + "\n" + "=== Costs will be add-ons ===");
        System.out.println(" 1: King Size = + $300 ");
        System.out.println(" 2: Queen Size = + $200 ");
        System.out.println(" 3: Single-Bedroom = + $100 ");
        System.out.println(" 4: Double-Bedroom = + $200 ");
        System.out.println(" 5: Squad-Bedroom = + $300 ");
        roomStandard = input.nextInt();

        switch(roomStandard)
        {
            case 1: costStandard = 300; break;
            case 2: costStandard = 200; break;
            case 3: costStandard = 100; break;
            case 4: costStandard = 200; break;
            case 5: costStandard = 300; break;
            default: System.out.print("Invalid room Standard");
        }

        input.nextLine();
        line();

        System.out.println("=== Plz, choose number of rooms ===");
        System.out.println("1: 2: 3: 4: 5: 6: 7: 8: 9: 10 ");
        numberOfRooms = input.nextInt();

        totalCost = (costType + costStandard) * numberOfRooms ;

        System.out.println( customerName +  totalCost);
   
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