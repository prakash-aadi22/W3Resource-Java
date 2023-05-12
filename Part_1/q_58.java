package Part_1;

import java.util.Scanner;

public class q_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String line = sc.nextLine();
//        String upper_case_line = "";
        StringBuilder upper_case_line = new StringBuilder();
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
//            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            upper_case_line.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
//        System.out.println(upper_case_line.trim());
        System.out.println(upper_case_line.toString().trim());
    }
}
//    the quick brown fox jumps over the lazy dog.