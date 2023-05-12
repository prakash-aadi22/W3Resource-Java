package Part_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class q_121 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(20);
        l.add(40);
        l.add(60);
        l.add(80);
        System.out.println("The linkedList is: " + l);
        Collections.reverse(l);
        System.out.println("The reversed linkedList is: " + l);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(40);
        al.add(60);
        al.add(80);
        System.out.println("The arrayList is: " + al);
        Collections.reverse(al);
        System.out.println("The reversed arrayList is: " + al);
    }
}
