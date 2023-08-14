class MYThread3 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good morning");

        }
    }
}
class MYThread4 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class CWH_ch_13_pr_02 {
    public static void main(String[] args) {
        MYThread3 t10=new MYThread3();
        MYThread4 t20=new MYThread4();
        t10.start();
        t20.start();
    }
    
}
