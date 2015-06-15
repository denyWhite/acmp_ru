import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String a = in.next();
        String b = in.next();
        String c = in.next();

        out.println(solve(a,b,c));
        out.flush();
    }

    public static String solve(String a, String b, String c)
    {
        if (a.length() > b.length() && a.length() > c.length()) return a;
        if (b.length() > a.length() && b.length() > c.length()) return b;
        if (c.length() > a.length() && c.length() > b.length()) return c;
        if (a.equals(b)) b = "0";
        else if (a.equals(c)) c = "0";
        else if (b.equals(c)) c = "0";
        byte[] ar = new byte[200];
        byte[] br = new byte[200];
        byte[] cr = new byte[200];
        int k = 1;
        for (int i = a.length() - 1; i >= 0; i--)
        {
            ar[k] = Byte.parseByte(String.valueOf(a.charAt(i)));
            k++;
        }
        k = 1;
        for (int i = b.length() - 1; i >= 0; i--)
        {
            br[k] = Byte.parseByte(String.valueOf(b.charAt(i)));
            k++;
        }
        k = 1;
        for (int i = c.length() - 1; i >= 0; i--)
        {
            cr[k] = Byte.parseByte(String.valueOf(c.charAt(i)));
            k++;
        }
        k = 1;
        int res = 0;
        int t = 0;
        while ((ar[k] > 0) || (br[k]>0) || (cr[k]>0))
        {
            t = max(ar[k],br[k],cr[k]);
            if (t != 0) res = t;
            k++;
        }
        if (res == 1) return a;
        else if (res == 2) return b;
        else return c;
    }

    public static int max(int x, int y, int z)
    {
        if (x > y && x > z) return 1;
        if (y > z && y > x) return 2;
        if (z > x && z > y) return 3;
        return 0;
    }

}