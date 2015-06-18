import java.math.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        int n = Integer.parseInt(y.next());
        BigInteger b = new BigInteger("1");
        BigInteger d = new BigInteger("2");
        for (int i = 1; i <= n; i++)
        {
            b = b.multiply(d);
        }
        System.out.println(b);
    }
}