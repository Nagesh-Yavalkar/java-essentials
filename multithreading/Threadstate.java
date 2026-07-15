
class Task implements Runnable {
  public void run(){
    System.out.println(Thread.currentThread().getName());

  }
}

class Threadstate{
   public static void main(String[] var0) throws InterruptedException {
      Task var1 = new Task();
      System.out.println(Thread.currentThread().getState());
      Thread var2 = new Thread(var1);
      System.out.println(Thread.currentThread().getState());
      Thread.sleep(2000L);
      System.out.println(Thread.currentThread().getState());
      var2.start();
      System.out.println(Thread.currentThread().getState());
      System.out.println(Thread.currentThread().getName());
   }
}
