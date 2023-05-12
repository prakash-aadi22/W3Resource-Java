package String;

import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str1 = "This is Exercise 1";
//        String str2 = "This is Exercise 2";
        String str1 = "This is Exercise 1";
        String str2 = sc.nextLine();
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}