class mydepricated{
    @Deprecated
    void met1(){
        System.out.println("I am method 1");
    }
}
public class CWH_ch_16_pr_02 {
    public static void main(String[] args) {
        mydepricated d=new mydepricated();
        d.met1();
        
    }
}
