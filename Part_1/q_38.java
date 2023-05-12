package Part_1;

import java.util.Scanner;

public class q_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Example: Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.print("Enter a random sentence with number and extra Character: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int letter = 0, space = 0, num = 0, other = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("The sentence is: " + s);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}
