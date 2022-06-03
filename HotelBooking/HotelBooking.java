import java.util.Scanner;

public class HotelBooking
{
    static String customerName;
    static int roomType;
    static int cost;
    static Scanner input = new Scanner(System.in);

    public static void main(String[]args)
    {
        System.out.println("\n"+"--- Welcome to Hotel California ---"+"\n");   

        line();
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