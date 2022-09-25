import java.util.Scanner;

public class EqualizeAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            t--;
            int a,b,x;
            a=in.nextInt();
            b=in.nextInt();
            x=in.nextInt();
            if(a==b)
            {
                System.out.println("YES");
            }
            else if(a+x==b-x)
            {
                System.out.println("YES");
            }
            else if(a-x==b+x)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
