import java.math.BigInteger;
import java.util.Scanner;

public class BigIntger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger factorial =  BigInteger.valueOf(1);
        int n = in.nextInt();
        for(int i=1;i<n;i++)
        {
            factorial = factorial.multiply( BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
