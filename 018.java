import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        long[] a = new long[900];
        int m = 0;
        String t = "";
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.next());
        a[0] = 1;
        int i;
        for (i = 2; i <= n; i++)
        {
            long o = 0;
            int j = 0;
            while (j <= m)
            {
                o = a[j] * i + o;
                a[j] = o % 10000;
                o /= 10000;
                j++;
            }
            if (o != 0)
            {
               m++;
                a[m] = o;
            }
        }
        for (i = m; i >= 0; i--)
        {
            t = ""+a[i];
            if (i != m)
            {
                while (t.length() < 4)
                    t = "0" + t;
            }
            out.print(t);
        }
        out.flush();
    }
}