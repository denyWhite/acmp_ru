
import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.next());
        int[][] ar = new int[n][n];
        int res = 0;
        int a = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                 a = Integer.parseInt(in.next());
                 if (a==1) res++;
            }
        out.println(res / 2);
        out.flush();
    }

}