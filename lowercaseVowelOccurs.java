public class lowercaseVowelOccurs {
    public static int lowerCaseVowelOcuurence(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count ++;
            }
        }
        return count;
    }
    public static void main (String args[])
    {
        String str="hello Tanishka , hOw Are you";
        System.out.println("number of lowercase vowels in string= "+ lowerCaseVowelOcuurence(str));
    }
}
