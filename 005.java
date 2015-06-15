
import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int res = 0;
        int[] ar = new int[a+1];
        for (int i = 1; i <= a; i++)
        {
            ar[i] = in.nextInt();
        }
        for (int i = 1; i <= a; i++)
        {
            if (ar[i] % 2 == 1)
            {
                out.print(ar[i]+" ");
                res--;
            }
        }
        out.println();
        for (int i = 1; i <= a; i++)
        {
            if (ar[i] % 2 == 0)
            {
                out.print(ar[i]+" ");
                res++;
            }
        }
        out.println();
        out.println(res >= 0 ? "YES" : "NO");
        out.flush();
    }
}