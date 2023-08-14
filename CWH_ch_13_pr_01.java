class MYThread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good morning");

        }
    }
}
class MYThread2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Welcome");

        }
    }
}



public class CWH_ch_13_pr_01 {
    public static void main(String[] args) {
        MYThread1 t1=new MYThread1();
        MYThread2 t2 =new MYThread2();
        t1.start();
        t2.start();
        
    }
}
