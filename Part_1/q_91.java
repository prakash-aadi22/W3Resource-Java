package Part_1;

public class q_91 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int i;
        System.out.print("The first 10 natural numbers are: ");
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("\nEstimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);

    }
}
