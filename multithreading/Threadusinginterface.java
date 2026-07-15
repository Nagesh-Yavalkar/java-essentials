// Thread using Runnable interface
class Mythread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}
class Threadusinginterface{
    public static void main(String[]args){
        Mythread t1 = new Mythread();
        Thread t = new Thread(t1);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}