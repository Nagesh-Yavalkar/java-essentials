class Counter{
    int count = 0;

     synchronized void increment(){
        count++;
    }
}

class CounterTest implements Runnable{
    Counter c;

    CounterTest(Counter c){
        this.c = c;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            c.increment();
        }
    }
}

public class Countereg{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterTest obj = new CounterTest(counter);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count: " + counter.count);
    }
}