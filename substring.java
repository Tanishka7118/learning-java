import java.util.*;
public class substring {
    
    public static String subString(String str,int si,int ei) //fuction that we have made for our understanding
    {
        String substr="";
        for(int i=si;i< ei;i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.print("\n Enter the starting index: ");
        int si=sc.nextInt();
        System.out.print("Enter the ending index: ");
        int ei=sc.nextInt();
        System.out.println("the substring is :"+subString(str,si,ei));
        //inbuilt function in java
        System.out.println("Substing is : "+ str.substring(si,ei));
    }
}
