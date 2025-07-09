public class Patterns
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
        for(int j=n-1;j>0;j--)
        {
            for(int sp=1;sp<j;sp++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
    }
}