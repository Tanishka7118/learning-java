import java.util.Scanner;
public class Checkpass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input;
        int attempt=0;
        String pass="Admin@123";
        for(int i=1;i<=3;i++)
        {
            System.out.print("Try "+i+":");
            input=sc.nextLine();
            if(input.equals(pass))
            {
                System.out.println("Access Granted");
                break;
            }
            attempt++;
        }
        if(attempt==3)
        {
            System.out.println("Account Locked");
        }
    }
}