package Part_1;

import java.util.Scanner;

public class q_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = sc.nextLine();
        word = word.trim();
//        String result = "";
        StringBuilder result = new StringBuilder();
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
//            result += ch[i];
            result.append(ch[i]);
        }
//        System.out.println("Reverse word: " + result.trim());
        System.out.println("Reverse word: " + result.toString().trim());
    }
}
