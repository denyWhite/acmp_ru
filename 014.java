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


        out.println(nok(a,b));
        out.flush();
    }

    public static int nok(int a, int b)
    {
        return a*b/nod(a,b);
    }

    public static int nod(int a, int b)
    {
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        while (a % b != 0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}