import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        int n = Integer.parseInt(y.next());
        int m = Integer.parseInt(y.next());
        Boolean[] er = new Boolean[m+1];
        for (int i = 2; i <= m; i++) er[i] = true;
        for (int i = 2; i <= Math.round(Math.sqrt(m)); i++)
        {
            if (er[i])
            {
                int j = i * i;
                while (j <= m)
                {
                    er[j] = false;
                    j += i;
                }
            }
        }
        Boolean f = true;
        for (int i = n; i <= m; i++)
            if (er[i])
            {
                System.out.print(i+" ");
                f = false;
            }
        if (f) System.out.print("Absent");
    }
}