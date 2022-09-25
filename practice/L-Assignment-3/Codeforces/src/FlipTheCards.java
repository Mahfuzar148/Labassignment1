import java.util.Scanner;

public class FlipTheCards {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            int x = in.nextInt();
            if (n == x || x == 0) {
                System.out.println(0);
            } else {
                int d = Math.abs(n - x);
                if (x < d) {
                    System.out.println(x);
                } else {
                    System.out.println(d);
                }
            }
        }
    }
}
;