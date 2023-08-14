abstract class pen{
   public void write(){
    System.out.println("I am writing...");
   }
   public void refill(){
    System.out.println("Refilling the ink...");
   }
}





public class CWH_ch_11_pr_01 {
    public static void main(String[] args) {
        pen p=new pen() {
            
        };
            
        p.write();
    }
}
