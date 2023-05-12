package Part_1;

public class q_66 {
    public static void main(String[] args) {
        int n = 100;
        int status = 1;
        int num = 3;
        int sum = 0;
//        if (n >= 1) {
//            System.out.print("First " + n + " prime numbers are: " + 2 + ", ");
//            // 2 is a known prime number
//        }
        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
//                    sum += num; // For the sum of first 100 non-prime number
                    break;
                }
            }
            if (status != 0) {
//                System.out.print(num + ", ");
                i++;
                sum += num;
            }
            status = 1;
            num++;
        }
        int newSum = sum + 2;
        System.out.print("Sum of first 100 prime number are: " + newSum);
    }
}
