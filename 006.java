import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String a = in.next();
        out.println(solve(a));
        out.flush();
    }

    public static String solve(String a)
    {
        if (a.length()!=5) return "ERROR";
        char[] b = a.toCharArray();
        if (b[2] != '-') return "ERROR";
        int q1 = (int) b[0] - 64;
        int q2 =(int) b[1] - 48;
        int q3 = (int) b[3] - 64;
        int q4 = (int) b[4] - 48;
        if ((q1 < 1) || (q1 > 8)) return "ERROR";
        if ((q2 < 1) || (q2 > 8)) return "ERROR";
        if ((q3 < 1) || (q3 > 8)) return "ERROR";
        if ((q4 < 1) || (q4 > 8)) return "ERROR";
        int x = (q1 - q3)*(q1 - q3);
        int y = (q2 - q4)*(q2 - q4);
        return x + y == 5 ? "YES":"NO";
    }

}