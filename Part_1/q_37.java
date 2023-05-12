package Part_1;

import java.util.Scanner;

public class q_37 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] letters = sc.nextLine().toCharArray();
        System.out.println(letters);
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
