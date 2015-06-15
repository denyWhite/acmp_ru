import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.next());
        out.println(kub(n, 0));
        out.flush();
    }

    public static int kub(int n, int m)
    {
        int f = n == 0? 1 : 0;
        while (m < n)
        {
            m++;
            f += kub(n - m, m);
        }
        return f;
    }
}
