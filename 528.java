import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        long n = Integer.parseInt(y.next());
        long k = Integer.parseInt(y.next());
        long res = 1;
        for (int i = 1; i <= k; i++)
        {
            res = res +  n * i - 2*(i - 1) - 1;
        }
        System.out.println(""+res);
    }
}