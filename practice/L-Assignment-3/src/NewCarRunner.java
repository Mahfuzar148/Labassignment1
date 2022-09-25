import java.util.Scanner;

public class NewCarRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter new car price=");
        int ncp = in.nextInt();
        System.out.println("Enter new miles per year=");
        int mpy = in.nextInt();
        System.out.println("Enter new estimated gas price=");
        int egp = in.nextInt();
        System.out.println("Enter new Efficiency=");
        int ef = in.nextInt();
        System.out.println("Enter new resale value=");
        int rv = in.nextInt();
        NewCar ob = new NewCar(ncp,mpy,egp,ef,rv);
        ob.totalGasPrice();
        ob.totalCost();
        int sm = ob.getSpentMoney();
        System.out.println(sm);
    }
}
