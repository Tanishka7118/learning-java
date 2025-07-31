public class exponentiation
{
    public static void main(String args[])
    {
        System.out.println(fastexpo(2,3));
        System.out.println(fastexponential(2,3));
    }
    public static int fastexpo(int n,int pow)
    {
        int ans=1;
        while(pow>0)
        {
            if((pow&1)!=0)
            {
                ans=ans*n;
            }
            n=n*n;
            pow=pow>>1;
        }
        return ans;
    }
    public static int fastexponential(int n,int pow)
    {
        int ans=1;
        for (int i = 0; i < 32; i++)
        {
            if((pow &(1<<i)) !=0)
            {
                ans=ans*n;
            }
            n=n*n;
        }
        return ans;
    }
}