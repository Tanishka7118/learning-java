public class Bitmanipulation
{
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();*/
        /*evenORodd(3);
        System.out.println(getIbit(10, 3));
        System.out.println(setIbit(10, 2));
        System.out.println(clearIbit(10, 1));
        System.out.println(updateBit(10, 2, 1));
        System.out.println(clearLastIBits(15, 2));
        System.out.println(clearRangeOfBit(10, 2, 4));
        powerOfTwo(32);*/
        System.out.println(countSetBit(15));
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
    public static int updateBit(int n,int i,int newbit)
    {
        n=n&(~(1<<i));
        return n|(newbit<<i);
    }
    public static int clearLastIBits(int n,int i)
    {
        n=n&(~0<<i);
        return n;
    }
    public static int clearRangeOfBit(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void powerOfTwo(int n)
    {
        if(((n&(n-1))==0)  && n!=0)
        {
            System.out.print(n+" is power of two");
        }
        else{
            System.out.print(n+" is not power of two");
        }
    }
    public static int countSetBit(int n)
    {
        int count=0;
        for(int i=0;i<32;i++)
        {
            if((n&(1<<i))!=0)
            {
                count++;
            }
        }
        return count;
    }
}