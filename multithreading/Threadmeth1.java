// Thread using Thread class
class Mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}
class Threadmeth1{
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        obj.start();
        System.out.println(Thread.currentThread().getName());
    }
}