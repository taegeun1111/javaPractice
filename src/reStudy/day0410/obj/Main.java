package reStudy.day0410.obj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen(123, "빨강", 1000);
        p1.company = new Company("모나미","서울");
        Pen p2 = new Pen(123, "빨강", 1000);

        System.out.println(p1);
        System.out.println(p1.equals(p2));

        Set<Pen> Penset = new HashSet<>();
        Penset.add(p1);
        Penset.add(p2);
        System.out.println(Penset.size());
        System.out.println(Penset);


    }
}
