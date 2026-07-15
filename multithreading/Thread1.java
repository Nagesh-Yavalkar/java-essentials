// Creates Thread Using Thread class 
class mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Nagesh");
    }
    
}
class Thread1{
    public static void main(String[] args) {
        mythread obj = new mythread();
        obj.start();      // here starts the thread 
        System.out.println(Thread.currentThread().getName());
    }
}