import java.lang.*;
import java.util.*;

class mythread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        
    }
}
class word{
    public static void main(String[]args){
        mythread obj = new mythread();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println(Thread.currentThread());

    }
}