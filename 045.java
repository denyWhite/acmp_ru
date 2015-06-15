
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

    public static String solve(int n)
    {
        if (n == 0) return "10";
        if (n < 10) return Integer.toString(n);
        String res = "";
        int[] ar  = new int[10];
        for (int i = 2; i <= 9; i++)
        {
            ar[i] = 0;
        }
        for (int i = 2; i <= 9; i++)
        {
            while (n % i == 0)
            {
                n /= i;
                ar[i]++;
            }
        }
        if (n != 1) return "-1";
        while (ar[2] >= 3)
        {
            ar[2] -= 3;
            ar[8]++;
        }
        while (ar[3] >= 2)
        {
            ar[3] -= 2;
            ar[9]++;
        }
        while ((ar[2] > 0) && (ar[4] > 0))
        {
            ar[2]--;
            ar[4]--;
            ar[8]++;
        }
        while ((ar[2] > 0) && (ar[3] > 0))
        {
            ar[2]--;
            ar[3]--;
            ar[6]++;
        }
        while (ar[2] >= 2)
        {
            ar[2] -= 2;
            ar[4]++;
        }
        while ((ar[2] > 0) && (ar[4] > 0))
        {
            ar[2]--;
            ar[4]--;
            ar[8]++;
        }
        for (int i = 2; i <= 9; i++)
        {
            while (ar[i] > 0)
            {
                ar[i]--;
                res += i;
            }
        }
        if (res.equals("")) return "-1";
        else return res;
    }


}
