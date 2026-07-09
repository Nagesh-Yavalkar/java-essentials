import java.util.ArrayList;

class Readpurpose{
    public static void main(String[] args) {
        ArrayList<Integer> it = new ArrayList<>();
        it.add(1);
        it.add(2);
        it.add(3);
        it.add(4);
        System.out.println(it);

        for (Integer integer : it) {
            System.out.println(integer);   
        }
    }
}

// In company if you want to read only then use foreach loop because it is readible and easy also 
