import java.util.Scanner;
import java.lang.String;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n+1] ;
        int sum=0;
        for(int i=0;i<n+1;i++)
        {
            s[i]=in.nextLine();
            if(s[i].equals("Tetrahedron"))
            {
                sum = sum +4;
            }
            else if(s[i].equals("Cube"))
            {
                sum = sum +6;
            }
            else if(s[i].equals("Octahedron"))
            {
                sum = sum +8;
            }
            else if(s[i].equals("Dodecahedron"))
            {
                sum = sum +12;
            }
            else if(s[i].equals("Icosahedron"))
            {
                sum = sum +20;
            }
        }
        System.out.println(sum);
    }
}
