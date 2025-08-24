public class stringCompression
{
    //using string func

    public static String compress(String str)
    {
        String newStr="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;  //as we have to add this in string so we are taking in integer class 
            while(i<str.length()-1  && str.charAt(i)==str.charAt(i+1))
                {
                    count++;
                    i++;
                }
                newStr += str.charAt(i);
            if(count>1)
            {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(compress(str));
        System.out.println(compressSB(str));
    }

    // using string builder
    public static String compressSB(String str)
    {
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count);
            }
        }
        return sb.toString();
    }
}

//complexity liner O(n)