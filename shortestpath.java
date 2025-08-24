import java.util.*;
class shortestpath
{
    public static float getShortestPath(String str)
    {
        int x=0,y=0;
        for(int i=0; i<str.length();i++)
        {
            char dir=str.charAt(i);
            if(dir == 'N')
            {
                y++;
            }
            else if(dir == 'E')
            {
                x++;
            }
            else if(dir=='S')
            {
                y--;
            }
            else
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the direction in capital letters:");
        s=sc.next();
        System.out.println("Shortest path is "+getShortestPath(s));
    }
}