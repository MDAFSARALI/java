abstract class pen{
    public void write(){
        System.out.println("I am writing...");
    }
    public abstract   void refill();
}
class pen2 extends pen{
    @Override
    public void refill(){
        System.out.println( "I am refilling the ink in the pen..");
    }
}




public class CWH_ch_11_pr_01_new {
    public static void main(String[] args) {
        pen2 p2=new pen2();
        p2.refill();
        p2.write();
    }
}
