abstract class Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("The call has been lifted...");
    }
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    public void disconnect(){
        System.out.println("The call has been disconnect...");
    }

}
public class CWH_ch_11_pr_04 {
    public static void main(String[] args) {
         SmartPhone s=new SmartPhone();
         s.disconnect();s.ring();s.lift();
    }
}
