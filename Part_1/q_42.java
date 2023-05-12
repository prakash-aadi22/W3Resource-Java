package Part_1;

//import java.io.Console;
import java.util.Scanner;

public class q_42 {
    public static void main(String[] args){
//        Console cons;
//        if ((cons = System.console()) != null) {
//            char[] pass_ward = null;
//            try {
//                pass_ward = cons.readPassword("Input your Password: ");
//                System.out.println("Your password was: " + new String(pass_ward));
//            } finally {
//                if (pass_ward != null) {
//                    java.util.Arrays.fill(pass_ward, ' ');
//                }
//            }
//        } else {
//            throw new RuntimeException("Can't get password...No console");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your Password: ");
        String str = sc.nextLine();
        System.out.println("Your password was: " + str);
    }
}
