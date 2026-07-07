import java.util.*;

class Hm{
    public static void main(String[]args){
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(400);
        System.out.println(i);        //print the all elements in ArrayList
        int sum = 0;
        for(Integer num:i){        // Print the sum of all elements in the ArrayList
            sum = sum+num;
        }
        System.out.println(sum);
        int max = Integer.MIN_VALUE;  // Print the Maximum value from ArrayList
        for(Integer n :i){
            if(n>max){
                max = n;
            }
        }
        System.out.println(max);

        for(Integer k : i){      // Print mark greter than 80
            if(k>80){
                System.out.println(k);
            }
        }


    }
}