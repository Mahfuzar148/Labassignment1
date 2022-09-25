import java.util.Scanner;

public class LeapYearRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year=");
        int y = in.nextInt();
        LeapYear ob = new LeapYear(y);
        boolean b = ob.getLeapYear();
        if(b)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
