package Part_1;

import java.util.Scanner;

public class q_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in second: ");
        long sec = sc.nextLong();

        long min1 = sec/60;
        System.out.println("sec: " + sec);
        System.out.println("min1: " + min1);
        long hr1 = min1/60;
        System.out.println("hr1: " + hr1);
        if (min1 > 59){
            hr1 = hr1 + 1;
            System.out.println("hr1: " + hr1);
        }
        System.out.println(hr1 + ":" + min1 + ":" + sec);
        System.out.println("----------------------------------------------------");
        long secs = sec % 60;
        System.out.println("secs: " + secs);
        long hr = sec / 60;
        System.out.println("hr: " + hr);
        long min = hr % 60;
        System.out.println("min: " + min);
        hr = hr / 60;
        System.out.println("hr: " + hr);
        System.out.println(hr + ":" + min + ":" + secs);
    }
}
//86399