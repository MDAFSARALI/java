class MyThread200 extends Thread{
    MyThread200(String name){
        super(name);

    }
    public void run(){
         while (true) {
            System.out.println("Thank you"+" "+this.getName());
            
         }
    }
}
public class CWH_ch_13_pr_03 {
    public static void main(String[] args) {
        MyThread200 m1=new MyThread200("A");
        MyThread200 m2=new MyThread200("B");
        MyThread200 m3=new MyThread200("C");
        MyThread200 m4=new MyThread200("D");
        MyThread200 m5=new MyThread200("E");
        System.out.println(m1.getPriority());
        m1.start();
        m1.setPriority(9);
        System.out.println(m2.getPriority());
        m2.start();
        m2.setPriority(6);
        System.out.println(5);
        m3.start();
        m3.setPriority(4);
        System.out.println(m4.getPriority());
        m4.start();
        m4.setPriority(3);
        System.out.println(m5.getPriority());
        m5.start();
        m5.setPriority(1);
    
    }
}
