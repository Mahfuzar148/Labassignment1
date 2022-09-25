import java.util.Scanner;
public class TriangleRunner {
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

        Triangle ob = new Triangle(a,a1,a2,b,b1,b2);
        ob.lengths();

        double sl1 = ob.getSideLength1();
        double sl2 = ob.getSideLength2();
        double sl3 = ob.getSideLength3();
        double angle1 = ob.getAngle1();
        double angle2 = ob.getAngle2();
        double angle3 = ob.getAngle3();
        double p = ob.getPerimeter();
        double area = ob.getArea();

        System.out.println("1st Side length="+sl1);
        System.out.println("2nd Side length="+sl2);
        System.out.println("3rd Side length="+sl3);
        System.out.println("Angle1="+angle1);
        System.out.println("Angle2="+angle2);
        System.out.println("Angle3="+angle3);
        System.out.println("Perimeter="+p);
        System.out.println("Area of triangle="+area);

    }
}
