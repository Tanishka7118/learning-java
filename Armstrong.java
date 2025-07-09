public class Armstrong {
    public static void main(String args[])
    {
        int n=153;
        int num=n;
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum=(d*d)*d+sum;
            num=num/10;
        }
        if(n==sum)
        {
            System.out.println(n+" is Armstrong NO.");
        }
        else{
            System.out.println(n+" is not a Armstrong NO.");
        }
    }
}
