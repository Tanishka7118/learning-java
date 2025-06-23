public class StarPyramidrecursion
{
    public static void printspace(int space)
    {
        if(space==0)
        {
            return;
        }
        System.out.print(" ");
        printspace(space-1);
    }
    public static void printstar(int star)
    {
        if(star==0)
        {
            return;
        }
        System.out.print("*");
        printstar(star-1);
    }
    public static void printpyramid(int i,int row)
    {
        if(i>row)
        {
            return;
        }
        printspace(row-i);
        printstar(2*i-1);
        System.out.println();
        printpyramid(i+1, row);
    }
    public static void main(String args[])
    {
        printpyramid(1, 4);
    }
}