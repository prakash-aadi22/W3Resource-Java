package Part_1;

public class q_15 {
    public static void main(String[] args) {
        int a,b,c,temp;
        a = 22;
        b = 2;
        c = 2002;
        System.out.print("Before swap: ");
        System.out.println(a + " - " + b + " - " + c);
        temp = a;
        a = c;
        c = temp;
        System.out.print("After swap: ");
        System.out.println(a + " - " + b + " - " + c);
        System.out.println("--------------------------");
        int a1, b1, c1;
        a1 = 22;
        b1 = 2;
        c1 = 2002;
        System.out.print("Before swap: ");
        System.out.println(a1 + " - " + b1 + " - " + c1);
        a1 = a1 + c1;
        c1 = a1 - c1;
        a1 = a1 - c1;
        System.out.print("After swap: ");
        System.out.println(a1 + " - " + b1 + " - " + c1);
    }
}
