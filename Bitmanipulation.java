public class Bitmanipulation
{
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();*/
        evenORodd(3);
        System.out.println(getIbit(10, 3));
        System.out.println(setIbit(10, 2));
        System.out.println(clearIbit(10, 1));
    }
    public static void evenORodd(int n)
    {
        if((n&1)==0)
        {
            System.out.println("EVEN");
        }
        else{
        System.out.println("ODD");
        }
    }
    public static int getIbit(int n,int i)
    {
        if((n&(1<<i))==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIbit(int n,int i)
    {
        return (n| (1<<i));
    }
    public static int clearIbit(int n,int i)
    {
        return (n&(~(1<<i)));
    }
}