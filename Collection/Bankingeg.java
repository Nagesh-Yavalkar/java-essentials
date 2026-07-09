import java.util.ArrayList;
import java.util.Iterator;

class Bankingeg{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(000);
        list.add(1000);
        list.add(000);
        list.add(500);
        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer b = it.next();
            if(b==0){
                it.remove();
            }
        }
        System.out.println(list);
    }
}

//if cash is equal to zero then it remove means during Traversal + Delete at same time 
// for that purpose Iterator is used 