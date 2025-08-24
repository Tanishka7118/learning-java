import java.util.*;
public class stringPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int l=str.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)== str.charAt(l-i-1) )
            {
                count++;
            }
        }
        if(count==str.length())
            {
                System.out.println("String is palindrome!");
            }
            else{
                System.out.println("No String is not palindrome!");
            }
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str)
    {
        for(int i=0;i<(str.length()/2);i++)
        {
            int l=str.length();
            if(str.charAt(i) != str.charAt(l-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
