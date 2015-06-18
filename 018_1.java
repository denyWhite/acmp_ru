import java.math.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        int n = Integer.parseInt(y.next());
        BigInteger b = new BigInteger("1");
        for (int i = 2; i <= n; i++)
        {
            b = b.multiply(new BigInteger(""+i));
        }
        System.out.println(b);
    }
}