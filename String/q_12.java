package String;

import java.util.Scanner;

public class q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the plural of Exercise: ");
        String str = sc.next();

        System.out.println(str.equalsIgnoreCase("Exercises") && str.endsWith("es"));
    }
}
