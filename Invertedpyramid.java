public class Invertedpyramid
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int sp=0;sp<i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}