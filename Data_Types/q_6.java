package Data_Types;

import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the body weight (in kgs): ");
        double weight = sc.nextDouble();
        System.out.print("Enter the body height (in meters): ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI (Body Mass Index) is: " + bmi);
        double bmi2 = weight / (height * height) * 703;
        System.out.println("Your BMI (Body Mass Index) is: " + bmi2);
        double bmi3 = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println("Your BMI (Body Mass Index) is: " + bmi3);
        double bmi4 = weight * 0.45359237 / (height * height * 0.00064516); // 0.0254 * 0.0254 = 0.00064516
        System.out.println("Your BMI (Body Mass Index) is: " + bmi4);
    }
}
// 452
// 72
// 61.30159143458721
