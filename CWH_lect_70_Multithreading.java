class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000) {
            System.out.println("My  cooking thread is running ....");
            System.out.println("I am happy...");
            i++;
        } 
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40000) {
            System.out.println("Thread 2 for chating  ....");
            System.out.println("I am sad...");
            i++;
        } 
    }
}


public class CWH_lect_70_Multithreading {
    public static void main(String[] args) {
        // CONCURRENCY: Managing more than 1 work but at a time we are performing only one...
        // PARALLALISM:Managing more than one work by different diffrent persons parallely...

        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();// To start a thread method we have to write start method...
        t2.start();
    }
}
