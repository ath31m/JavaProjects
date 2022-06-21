import Department.Teacher;
import java.util.ArrayList;

public class mainTeacher
{
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher("Chandler Bing", 25, "Sarcasm");
        Teacher teacher2 = new Teacher("Samuel L Jackson", 55, "Language");
        Teacher teacher3 = new Teacher("Ross Geller", 25, "Paleontology");
        Teacher teacher4 = new Teacher("Monica Geller", 25, "Cleaning");
        Teacher teacher5 = new Teacher("Rachel Green", 25, "Shopping");
        Teacher teacher6 = new Teacher("Joey Tribianni", 25, "HookUp");


        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);
        teacherList.add(teacher6);

        for (int i=0; i<teacherList.size(); i++)
        {
            System.out.println(teacherList.get(i));
        }
    }
}