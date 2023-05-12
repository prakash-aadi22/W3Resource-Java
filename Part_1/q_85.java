package Part_1;

import java.util.Scanner;

public class q_85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your intro: ");
        String question = sc.nextLine();
//        String question = "Hello, how are you?";
        System.out.println(question.startsWith("Hello"));
    }
}
