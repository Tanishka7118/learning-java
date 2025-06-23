public class StarReactangleRecursion
{
    public static void printrec(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        printstar(col);
        System.out.println();
        printrec(row-1,col);
    }
    public static void printstar(int col)
    {
        if(col==0)
        {
            return;
        }
        System.out.print("*");
        printstar(col-1);
    }
    public static void main(String args[])
    {
        int row=4;
        int col=5;
        printrec(row,col);
    }
}