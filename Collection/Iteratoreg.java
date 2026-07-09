import java.util.*;

class Iteratoreg{
    public static void main(String[] args) {
        ArrayList<String> it = new ArrayList<>();
        it.add("coupon1");
        it.add("coupon2");
        it.add("coupon3");
        it.add("coupon4");
        it.add("coupon end");
        it.add("coupon5");
        System.out.println(it);

        Iterator<String>i = it.iterator();
        while (i.hasNext()) {
            String b = i.next();
            if(b.equals("coupon end")){     // if coupon is end then it remove that is real use in company
                i.remove();
            }
            
        }
        System.out.println(it);
        
    }
}

// Here Iterator use beacause in iterator there is method of remove 
// you can type command "javap java.util.Iterator" here you can see bytecode 