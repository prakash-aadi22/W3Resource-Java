package Part_1;

import java.util.Scanner;

public class q_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the factor: ");
        int a = sc.nextInt();
        System.out.print("The factors are: ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nNumber of factors are: ");
        int ctr = 0;
        for (int i = 1; i <= (int) Math.sqrt(a); i++) {
            if (a % i == 0 && i * i != a) {
                ctr += 2;
            }
            else if (i * i == a) {
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
