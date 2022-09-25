import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n] ;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]==1)
            {
                c1++;
            }
            else if(a[i]==2)
            {
                c2++;
            }
            else if(a[i]==3)
            {
                c3++;
            }

        }
        int min =Math.min(c1,c2);
         min = Math.min(min,c3);
        System.out.println(min);

    }
}
