import java.util.Scanner;
public class TrangleRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st coordinate=");
        int a = in.nextInt();
        int b =  in.nextInt();
        System.out.println("Enter 2nd coordinate=");
        int a1 =  in.nextInt();
        int b1 =  in.nextInt();
        System.out.println("Enter 3rd coordinate=");
        int a2 =  in.nextInt();
        int b2 = in.nextInt();

        Trangle ob = new Trangle(a,a1,a2,b,b1,b2);

        double sl1 = ob.getSideLength1();
        double sl2 = ob.getSideLength2();
        double sl3 = ob.getSideLength3();
        System.out.println(sl1);
        System.out.println(sl2);
        System.out.println(sl3);

    }
}
