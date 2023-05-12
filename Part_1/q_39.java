package Part_1;

public class q_39 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to create and display unique three-digit number using 1, 2, 3, 4." +
                           " Also count how many three-digit numbers are there.");
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        total++;
                        System.out.print(i + "" + j + "" + k + ", ");
                    }
                }
            }
        }
        System.out.println("\n");
        System.out.println("Total number of the three-digit-number is " + total);
    }
}
