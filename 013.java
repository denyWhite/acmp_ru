
import java.io.*;
import java.util.*;


public class Main
{
    public static void main(String[] args)   throws Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] ar = new int[10];
        int x,y;
        int byk = 0;
        int kor = 0;
        for (int i=1; i<=9; i++)
            ar[i] = 0;
        while (a != 0)
        {
            x = a % 10;
            y = b % 10;
            ar[x]++;
            ar[y]++;
            if (x == y) byk++;
            a /= 10;
            b /= 10;
        }
        for (int i=1; i<=9; i++)
            if (ar[i] >= 2) kor++;
        kor -= byk;
        out.println(byk + " " + kor);
        out.flush();
    }




}
