import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=0;
        while(n>0)
        {
            if(n>=100)
            {
                n = n-100;
                c++;
            }
            else if(n>=20)
            {
                n = n-20;
                c++;
            }
            else if(n>=10)
            {
                n = n-10;
                c++;
            }
            else if(n>=5)
            {
                n=n-5;
                c++;
            }
            else if(n>=1)
            {
                n = n -1;
                c++;
            }
        }
        System.out.println(c);
    }
}
