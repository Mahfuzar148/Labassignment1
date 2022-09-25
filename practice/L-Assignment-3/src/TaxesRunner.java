import java.sql.SQLOutput;
import java.util.Scanner;

public class TaxesRunner{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your condition=");
        String s = in.nextLine();
        System.out.println("Enter your condition = ");
        int i = in.nextInt();
        Taxes ob = new Taxes(i,s);
        ob.countTaxes();
        int t = ob.getTaxes();
        System.out.println(t);
    }
}