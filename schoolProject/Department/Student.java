package Department;

public class Student extends User
{
    private String major;
    private int rollNo;

    public Student(String name, int age, int rollNo, String major)
    {
        super (name, age);
        this.rollNo = rollNo;
        this.major = major;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public String toString()
    {
        return super.toString() + ", RollNo. : " + rollNo + ", Major: " + major ; 
    }
}