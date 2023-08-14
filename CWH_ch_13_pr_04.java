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
public class CWH_ch_13_pr_04 {
    public static void main(String[] args) {
        MyThread200 t=new MyThread200("A");

        System.out.println( t.getState());//Before start it is new 
        t.start();
        System.out.println(t.getState());// After start it becomes runnable state.
    }
}
