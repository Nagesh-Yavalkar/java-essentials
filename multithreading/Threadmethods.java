class mytherad extends Thread{
    public void run(){
        
        Thread.currentThread().setName("email Thread");
        System.out.println(Thread.currentThread().getName());

    }

}
class Threadmethods{
    public static void main(String[] args) throws InterruptedException {
        mytherad obj = new mytherad();
        obj.start();
        Thread.sleep(2000);
        
        Thread.currentThread().setName("Payment Thead");
        System.out.println(Thread.currentThread().getName());
    }
}