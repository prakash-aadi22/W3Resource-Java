package String;

public class q_9 {
    public static void main(String[] args) {
        String s1 = "example.com";
        System.out.println("The first string: " + s1);
        String s2 = "Example.com";
        System.out.println("The second string: " + s2);
        CharSequence cs = "example.com";
        System.out.println("Comparing " + s1 + " and " + cs + ": " + s1.equals(cs));
        System.out.println("Comparing " + s2 + " and " + cs + ": " + s2.equals(cs));
        System.out.println("Comparing " + s1 + " and " + cs + ": " + s1.contentEquals(cs));
        System.out.println("Comparing " + s2 + " and " + cs + ": " + s2.contentEquals(cs));
    }
}
