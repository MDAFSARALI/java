class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        // int i=0;
        while (true) {
            System.out.println("Thank you"+" "+this.getName()); 
        }
        
    }
}

public class CWH_lect_74_Thread_priority {
    public static void main(String[] args) {
//  java.lang.priority{min_priority}=1
//  java.lang.priority{norm_priority}=5
//  java.lang.priority{max_priority}=10
        MyThr1 t1=new MyThr1("A");
        MyThr1 t2=new MyThr1("B");
        MyThr1 t3=new MyThr1("C");
        MyThr1 t4=new MyThr1("D");
        MyThr1 t5=new MyThr1("E (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // They are not maintaining the order all time they are printing the different orders...
    }
}
