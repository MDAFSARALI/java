class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while (true) {
           // System.out.println("I am a thread...");
        }
    }
}



public class CWH_lect_73_Constructor_in_Thread {
    public static void main(String[] args) {
        MyThr t1=new MyThr("HARRY");
        MyThr t2=new MyThr("Raju");
        t1.start();
        t2.start();
            System.out.println("The id of the thread1 t1 is : "+t1.getId());
            System.out.println("The name of the thread is :"+t1.getName());
            System.out.println("The id of the thread t2 is : "+t2.getId());
            System.out.println("The name of the thread2 is :"+t2.getName());
    }
}
