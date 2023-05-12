package Part_1;

import java.util.Scanner;

public class q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the multiplication table of: ");
        long tab = sc.nextLong();
        System.out.println("The multiplication table of " + tab + " is: ");
        for (int i = 1;i<=10;i++){
            System.out.println(tab + " X " + i + " = " + tab*i);
        }
    }
}
