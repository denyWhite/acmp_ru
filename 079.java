import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(solve(a,b));
        out.flush();
    }

    private static int solve(int a, int b)
    {
        int res = a % 10;
        for (int i = 1; i < b; i++)
        {
            res *= a;
            res = res % 10;
        }
        return res;
    }
}