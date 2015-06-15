import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        out.println(solve(a));
        out.flush();
    }

    public static int solve(int a)
    {
        int res = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0) res = compare(res,i);
        }
        return res;
    }

    public static int compare(int x, int y)
    {
        int sumX = 0;
        int sumY = 0;
        int tempX = x;
        int tempY = y;
        while (x > 0)
        {
            sumX += x % 10;
            x /= 10;
        }
        while (y > 0)
        {
            sumY += y % 10;
            y /= 10;
        }
        return sumX > sumY ? tempX : tempY;
    }
}
