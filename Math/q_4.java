package Math;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float number: ");
        float f_num = sc.nextFloat();
        System.out.println("Rounded float number is: " + Math.ceil(f_num));
        System.out.println("Rounded float number is: " + Math.floor(f_num));
        System.out.println("Rounded float number is: " + Math.round(f_num));
        System.out.println("-----------------------------------------------------------------");

        float x = 451.3256412f;
        int decimal_place = 4;
        BigDecimal bd_num = new BigDecimal(Float.toString(x));
        bd_num = bd_num.setScale(decimal_place, RoundingMode.HALF_UP);
        System.out.println("Original number: " + x);
        System.out.println("Rounded upto 4 decimal: " + bd_num);
        System.out.println("-----------------------------------------------------------------");
        float x1 = 451.3256412f;
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(x1));
        System.out.println("=================================");
        System.out.println(Math.round(x1 * 10000) / 10000.0);
    }
}
