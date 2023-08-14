class MyThread200 extends Thread{
    MyThread200(String name){
        super(name);

    }
    public void run(){
        int i=0;
         while (i<=5) {
            System.out.println("Thank you"+" "+this.getName());
            i++;
         }
    }
}
public class CWH_ch_13_pr_05 {
    public static void main(String[] args) {
        MyThread200 t0=new MyThread200("A");
        t0.start();
        System.out.println(Thread.currentThread().getState());
        // System.out.println(t0.currentThread());
    }
}
