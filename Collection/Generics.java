import java.util.ArrayList;
import java.util.*;

class Generics{
    public static void main(String[] args) {
        Collection <String> s = new ArrayList<>();
        s.add("Nagesh");
        s.add("Ramesh");
        System.out.println(s);
        //s.add(100);   // error occur due to Generics
    }
}