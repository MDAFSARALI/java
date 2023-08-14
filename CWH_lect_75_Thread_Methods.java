class MyThr1 extends Thread {
    public MyThr1() {
        super();
    }

    public void run() {
        while (true) {
            System.out.println("Thank you");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }

    }
}

class MyThr2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("So much");
        }

    }
}

public class CWH_lect_75_Thread_Methods {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1();
        //  MyThr1 t2=new MyThr1();
         MyThr2 t2=new MyThr2();
        t1.start();
        
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();
        
// Learn java thread methods from oracle website...It is the part of operating System...
    }
}
