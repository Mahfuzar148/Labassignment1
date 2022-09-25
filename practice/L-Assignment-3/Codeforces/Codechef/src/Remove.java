import java.math.BigInteger;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t>0)
        {
            BigInteger m = BigInteger.ONE;

            int n=in.nextInt();
            int c=0;
            BigInteger[] a = new BigInteger[n];
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextBigInteger();
                if((a[i].compareTo(new BigInteger("0"))<0))
                {
                    c++;
                }
               m = m.multiply(a[i]);
            }
            if((m.compareTo(new BigInteger("0")))>=0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(c%2);
            }
            t--;

        }
    }
}
