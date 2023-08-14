
interface myinterface{
    public void display();
}
public class CWH_ch_16_pr_04 {
    public static void main(String[] args) {
        myinterface mi=()->{
            System.out.println("I am display...");
        };
    }
}
