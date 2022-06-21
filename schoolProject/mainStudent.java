import Department.Student;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class mainStudent
{
    // State ( properties/ attributes )

    private static Scanner userInput = new Scanner (System.in);
    private static HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
    private static int action;
    private static int id = 1;

    // Constructors ( Special method )

    // Main Method

    public static void main(String[] args)
    {
        do
        {
            System.out.println("=== Plz, Fill in the Student Profile ===");
            line();
            System.out.println(" 1: Add Student Information");
            System.out.println(" 2: Read Student Information");
            System.out.println(" 3: Update Student Information");
            System.out.println(" 4: Delete Student Information");
            System.out.println(" 5: Preview Student Information");
            System.out.println(" 6: Exist");
            
            line();
            System.out.print("Choose action: ");
            action  = userInput.nextInt();
            line();

            menu(action);

        } while(action != 6);
    }

    //Behaviors ( methods )   
    
    public static void menu(int act)
    {
        switch(act)
        {
            case 1: add(); break;
            case 2: read(); break;
            case 3: update(); break;
            case 4: delete(); break;
            case 5: preview(); break; 
            case 6: exist(); break;
            default: System.out.println("Invalid action!! Plz, choose again");
        }
    }

    public static void add()
    {   
        userInput.nextLine();

        System.out.println("Enter Student name: ");
        String name = userInput.next();

        userInput.nextLine();

        System.out.println("Enter Student age: ");
        int age = userInput.nextInt();

        userInput.nextLine();

        System.out.println("Enter Student roll no: ");
        int rollNo = userInput.nextInt();

        userInput.nextLine();

        System.out.println("Enter Student major: ");
        String major = userInput.nextLine();

        Student student = new Student(name, age, rollNo, major);

        studentMap.put(id,student);

        id++;

    }

    public static void read()
    {
        if (studentMap.size() == 0)
        {
            System.out.println("No Student Information");
        }
        else
        {
            System.out.println("1) For one student");
            System.out.println("2) For all students");

            System.out.println("Plz, Choose action: ");
            action = userInput.nextInt();

            line();
            
            if (action == 1)
            {
                System.out.print("Enter Student Id: ");
                int studentID = userInput.nextInt();
                System.out.println(studentMap.get(studentID));
                line();
            }
            else if( action == 2 )
            {
                for(Student student: studentMap.values())
                {
                   System.out.println(student);
                }
                line();
            }
            else
            {
                System.out.println("Sorry, Wrong Action");
            }
        }
    }

    public static void update()
    {   
        if (studentMap.size() == 0)
        {
            System.out.println("No Student Information");
        }

        else
        {
            System.out.print("Enter Student Id: ");
            int studentID = userInput.nextInt();

            line();

            System.out.println(" 1: Change Student Name");
            System.out.println(" 2: Change Student Age");
            System.out.println(" 3: Change Student roll No.");
            System.out.println(" 4: Change Student Major");

            line();

            System.out.print("Choose action: ");
            int action  = userInput.nextInt();

            switch (action)
            {
                case 1: 
                {
                    System.out.print("Enter student name to be changed: ");
                    String name = userInput.nextLine();

                    studentMap.get(studentID).setName(name);

                    System.out.println("Successfully changed student name.");
                    line();
                } break;
                
                case 2: 
                {
                    System.out.print("Enter student age to be changed: ");
                    int age = userInput.nextInt();
                    
                    studentMap.get(studentID).setAge(age);
                    System.out.println("Successfully changed student age.");
                    line();
                } break;
                
                case 3: 
                {
                    System.out.print("Enter student roll No. to be changed: ");
                    int rollNo = userInput.nextInt();
                    
                    studentMap.get(studentID).setRollNo(rollNo);
                    System.out.println("Successfully changed student rollNo.");
                    line();
                } break;
                
                case 4: 
                {
                    System.out.print("Enter student major to be changed: ");
                    String major = userInput.nextLine();
                    
                    studentMap.get(studentID).setMajor(major);
                    System.out.println("Successfully changed student major.");
                    line();
                } break;

                default: System.out.println(" Wrong action!! "); break; 
            }
        }
        
    }

    public static void delete()
    {
        if (studentMap.size() == 0)
        {
            System.out.println("No Student Information");
        }

        else
        {
            System.out.println("1) For one student");
            System.out.println("2) For all students");

            System.out.println("Plz, Choose action: ");
            action = userInput.nextInt();

            line();
            
            if (action == 1)
            {
                System.out.println("Enter Student Id: ");
                int studentID = userInput.nextInt();

                studentMap.remove(studentID);
                System.out.println("Successfully removed Student Id: " + studentID);
            }
            
            else if( action == 2 )
            {
                studentMap.clear();
                System.out.println("Successfully removed all Student Ids: ");
            }
            
            else
            {
                System.out.println("Sorry, Wrong Action");
            }
        }

    }

    public static void preview()
    {
        if (studentMap.size() == 0)
        {
            System.out.println("No Student Information");
        }
        else
        {
            try
            {
                FileWriter fw = new FileWriter("studentList.txt");

                LocalDate ldt = LocalDate.now();
                LocalTime lt = LocalTime.now();

                DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                DateTimeFormatter currentTime = DateTimeFormatter.ofPattern("hh-mm a");
                


                fw.write("===  SCHOOL MANAGEMENT SYSTEM ===");
                fw.write("\n");

                fw.write("Date : " + currentDate.format(ldt));
                fw.write("Time : " + currentTime);

                for( Student student : studentMap.values())
                    {
                        fw.write( student + "\n" );
                    }
                
                fw.close();
            }
            catch(IOException e)
            {
                System.out.print(e);
            }
        }
    }

    public static void exist()
    {
        System.out.println("Bye Bye!!!");
        line();
    }

    public static void line()
    {
        for (int i=0; i<=80; i++)
        {
            System.out.print("=");
        }
        System.out.print("\n");
    }


}