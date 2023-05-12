package String;

public class q_10 {
    public static void main(String[] args) {
        String str1 = "example.com", str2 = "Example.com";
        StringBuffer sb = new StringBuffer(str1);
//        System.out.println("Comparing " + str1 + " and " + sb + ": " + str1.equals(sb));
//        System.out.println("Comparing " + str2 + " and " + sb + ": " + str2.equals(sb));
        System.out.println("Comparing " + str1 + " and " + sb + ": " + str1.contentEquals(sb));
        System.out.println("Comparing " + str2 + " and " + sb + ": " + str2.contentEquals(sb));
    }
}
