package Part_1;

import java.util.Scanner;

public class q_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = sc.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: " + words[words.length - 2]);
    }
}
//  The quick brown fox jumps over the lazy dog.