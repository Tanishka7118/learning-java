import java.util.*;
public class comparetypes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //array is intialised
        //String fruits[]= {"apple","mango","banana"};
        //taking array as input
        String fruits[]=new String[4];
        System.out.println("enter fruits");
        for (int i =0;i<fruits.length;i++)
        {
            fruits[i]=sc.next();
        }
        String largest=fruits[0];
        for(int i=1; i<fruits.length;i++)
        {
            if(largest.compareTo(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
