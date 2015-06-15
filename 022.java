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

    private static int solve(int a)
    {
        int res = 0;
        while (a != 0)
        {
            res += a % 2;
            a /= 2;
        }
        return res;
    }
}
