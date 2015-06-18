import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        int n = Integer.parseInt(y.next());
        System.out.println(f(n));
    }

    public static int f(int n)
    {
        if (n <= 1) return n;
        return f(n-1)+f(n-2);
    }
}