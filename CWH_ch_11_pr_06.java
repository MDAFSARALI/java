interface TVremote{
    void volumeup();
    void volumelow();
    void channelChange();
}
interface SmartTv extends TVremote {
    void Touch();
}
class afs implements SmartTv{
    public void volumelow(){
        System.out.println("Vloume low ");
    }
    public void volumeup(){
        System.out.println("Vloume Up ");
    }
    public void channelChange(){
        System.out.println("Channel chnage");
    }
    public void Touch(){
        System.out.println("Touch is activate...");
    }
 
}
public class CWH_ch_11_pr_06 {
    public static void main(String[] args) {
        afs f1=new afs();
        f1.Touch();f1.channelChange();f1.volumelow();f1.volumeup();
        
    }
}
