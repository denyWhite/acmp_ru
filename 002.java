
import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args)   throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();//считываем целое число a
        out.println(solve(n));
        out.flush();
    }

    public static long solve(int n)
    {
        if (n == 0) return 1;
        int res = 0;
        for (int i=1; i<=Math.abs(n); i++)
        {
            res += i;
        }
        if (n < 0) res -= 1;
        return Math.abs(n)/n*res;
    }


}
