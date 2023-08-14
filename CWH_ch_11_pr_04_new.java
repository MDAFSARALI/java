abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    public void ring (){
        System.out.println("Ringing...");
    }
    public void lift (){
        System.out.println("Lifting...");
    }
    public void disconnect (){
        System.out.println("Disconnected...");
    }
    
}
public class CWH_ch_11_pr_04_new {
    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone();
        s1.disconnect();s1.lift();s1.ring();
    }
}
