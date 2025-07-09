public class SquareHollowDiamond
{
    public static void main(String args[])
    {
        int n=5;
        System.out.println("Diamond");
        for(int i=1;i<=n;i++)
        {
            for(int space=n-i+1;space>0;space--)
            {
                System.out.print("*");
            }
            for(int j=2;j<=2*i-1;j++)
            {
                System.out.print(" ");
            }
            for(int space=n-i+1;space>0;space--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int space=n-i;space>0;space--)
            {
                System.out.print("*");
            }
            for(int j=2;j<=2*i-1;j++)
            {
                System.out.print(" ");
            }
            for(int space=n-i;space>0;space--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}