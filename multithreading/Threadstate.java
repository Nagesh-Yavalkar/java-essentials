class Task implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
}
class Threadstate{
    public static void main(String[] args) throws InterruptedException {
        Task obj = new Task();
        
        Thread t1 = new Thread(obj);
        System.out.println(Thread.currentThread().getState());
       
        Thread.sleep(2000);
        
        t1.start();
        ;
        System.out.println(Thread.currentThread().getName());

    }
}