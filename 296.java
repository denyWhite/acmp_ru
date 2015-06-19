import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        int n = Integer.parseInt(y.next());
        int p = n / 5;
        if ( p * 5 != n) p++;
        int t = 0;
        while (5 * p + 3 * t != n)
        {
            p--;
            while (5 * p + 3 * t < n)
            {
                t++;
            }
        }
        System.out.println(p + " " + t);
    }
}