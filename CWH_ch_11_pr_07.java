
interface TVremote{
    void volumeup();
    void volumelow();
    void channelChange();
}
interface SmartTv extends TVremote {
    void Touch();
}
class TV implements TVremote{
    public void volumelow(){
        System.out.println("Vloume low ");
    }
    public void volumeup(){
        System.out.println("Vloume Up ");
    }
    public void channelChange(){
        System.out.println("Channel chnage");
    }
      
}
public class CWH_ch_11_pr_07 {
    public static void main(String[] args) {
        TV sumsung=new TV();
        sumsung.volumelow();sumsung.volumeup();sumsung.channelChange();
    }
}
