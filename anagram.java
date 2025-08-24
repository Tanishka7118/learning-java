import java.util.*;

public class anagram {
    public static void main(String args[])
    {
        /*An anagram is a word or phrase formed by rearranging the letters of 
        another word or phrase, using all the letters exactly once.*/
        String s1="care";
        String s2="race";
        // converting in lower case
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        //checking if length is equal or not
        if(s1.length() == s2.length())
        {
            //converting string into char array
            char s1CharArray[]= s1.toCharArray();
            char s2CharArray[]= s2.toCharArray();

            //sorting char array
            Arrays.sort(s1CharArray);
            Arrays.sort(s2CharArray);

            //checking arrays are equal or not
            boolean result=Arrays.equals(s1CharArray,s2CharArray);

            if (result)
            {
                System.out.println(s1+ " and "+s2+" are anagramas");
            }
            else{
                System.out.println(s1+ " and "+s2+" are not anagramas");
            }
        }
    }
}
