public class RecurssionPractice {
    public static void main(String args[])
    {
        /*nTimesname(5);
        nNo(10);
        nStartNo(10);
        int sum=0;
        System.out.println(sumOfno(5));
        RecurssionPractice ob=new RecurssionPractice();
        System.out.println(ob.fact(5));
        for(int i = 0; i < 10;i++) {
            System.out.print(fibonacci(i) + " ");
        }
            */
            int arr[]={1,2,3,4,5,6};
            int rev[]=arrayReverse(arr);
            for(int i=0;i<rev.length;i++)
            {
                System.out.print(rev[i]);
            }
    }
    public static void nTimesname(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Tanishka ");
        nTimesname(n-1);
    }
    public static void nNo(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n+" ");
        nNo(n-1);
    }
    public static void nStartNo(int n)
    {
        if(n==0)
        {
            return;
        }
        nStartNo(n-1);
        System.out.println(n+" ");
    }
    public static int sumOfno(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+ sumOfno(n-1);
    }
    int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n* fact(n-1);
    }
    public static int fibonacci(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int temp=0,a=0,b=1;
        for(int i=2;i<=n;i++)
        {
            temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
    public static int[] arrayReverse(int arr[])
    {
        int revarr[]=new int[arr.length];
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            revarr[len-1-i]=arr[i];
        }
        return revarr;
    }
}

