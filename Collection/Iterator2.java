import java.util.*;
class Iterator2{
    public static void main(String[] args) {
        ArrayList<Integer> it = new ArrayList<>();
        it.add(1);
        it.add(2);
        it.add(3);
        it.add(4);
        System.out.println(it);
        Iterator<Integer> a = it.iterator();
        while(a.hasNext()){
            Integer b = a.next();
            if(b%2==0){
                a.remove();     // Here you can change list using Iterator so output is correct
                                // if you change direct collection means it.remove(b)  then you get exception concurrentmodificationexception
                                // it is occure due to modcount and expectedmodcount is different
            }
        }
        System.out.println(it);
    }
}