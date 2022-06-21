import Department.User;

public class mainUser
{
    public static void main(String[] args)
    {
        User user1 = new User("John Doe", 20);
        User user2 = new User("John Wick", 30);
        User user3 = new User("John Lennon", 40);

        User[] users = {user1, user2, user3};
        //System.out.println(users[1].getName());

        for ( int x=0; x < users.length ; x++)
        {
            System.out.println( "Age: " + users[x].getAge() + " "  );
        }
    }
}