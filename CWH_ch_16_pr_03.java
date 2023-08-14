class mydepricated{
    
    public Object met1;
    @Deprecated
    public void met1() {
        System.out.println("This is deprecated method...");
    }
}
public class CWH_ch_16_pr_03 {
    
    public static void main(String[] args) {
       mydepricated d=new mydepricated();
       d.met1();
    //    please watch the concept of SuppressWarning ...
       //@SuppressWarnings

      // d.met1("Deprecated");
    }
}
