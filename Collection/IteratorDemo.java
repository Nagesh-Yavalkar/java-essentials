import java.util.*;

class IteratorDemo{
    public static void main(String[] args) {
        ArrayList<String> it = new ArrayList<>();
        it.add("Nagesh");
        it.add("Mahesh");
        it.add("ramesh");
        it.add("Ganesh");

        System.out.println(it);
        Iterator<String> i = it.iterator();    //iterator in that Iterator is datatype <String> is Generics 
                            // i is variable and it.iterator() is a method of ArrayList in that it return object 
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}