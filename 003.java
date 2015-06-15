
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

    private static String solve(int a)
    {
        int res =  a / 10;
        res = res * (res + 1);
        return res == 0?"25":Integer.toString(res) + "25";
    }
}
