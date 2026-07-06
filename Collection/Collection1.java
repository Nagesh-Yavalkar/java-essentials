import java.util.*;
class CollectionDemo{
    public static void main(String[]args) {
        Collection <String> ch = new ArrayList<String>();
        ch.add("Nagesh");
        ch.add("Mahesh");
        ch.add("Durgesh");
        ch.add("Ramesh");
        System.out.println(ch);
        ch.remove("Ramesh");
        System.out.println(ch);
        System.out.println("Size: " + ch.size());
        System.out.println(ch);
        System.out.println("isEmpty: " + ch.isEmpty());
        ch.clear();
       
        
        System.out.println(ch.size());
    }

    }
