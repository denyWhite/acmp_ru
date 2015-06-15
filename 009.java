import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.next());
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = Integer.parseInt(in.next());
        }
        int indMin = 0;
        int indMax = 0;
        int Min = ar[0];
        int Max = ar[0];
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] > 0) sum += ar[i];
            if (ar[i] > Max)
            {
                Max = ar[i];
                indMax = i;
            }
            if (ar[i] < Min)
            {
                Min = ar[i];
                indMin = i;
            }
        }
        if (indMax < indMin)
        {
            int temp = indMax;
            indMax = indMin;
            indMin = temp;
        }
        int mult = 1;
        for (int i = indMin + 1; i < indMax; i++)
        {
            mult *= ar[i];
        }

        out.println(sum + " " +mult);
        out.flush();
    }
}