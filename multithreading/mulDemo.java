class mulDemo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
}
class mul{
    public static void main(String[]args){
        mulDemo obj = new mulDemo();
        obj.start();
        System.out.println(obj.getState());
        obj.start();
       
        System.out.println(obj.getState());
    }
}