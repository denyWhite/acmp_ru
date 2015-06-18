import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        int n = Integer.parseInt(y.next());
        int res = 0;
        for (int i = n + 1; i < 2 * n; i++)
        {
            if (is_simple(i)) res++;
        }
        System.out.println(res);
    }

    public static Boolean is_simple(int n)
    {
        for (int i = 2; i <= Math.round(Math.sqrt(n)); i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

}