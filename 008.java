import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());
        int c = Integer.parseInt(in.next());
        out.println(solve(a,b,c) ? "YES" : "NO");
        out.flush();
    }

    public static Boolean solve(int a, int b, int c)
    {
        return (a*b == c);
    }
}