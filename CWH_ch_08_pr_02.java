class cellphone{
public void ringing(){
    System.out.println("The cell phone is ringing:");
}
public void vibrating() {
    System.out.println("This phone also vibrates..");
}

    

}
public class CWH_ch_08_pr_02 {

    public static void main(String[] args) {
        cellphone nokia=new cellphone();
        nokia.ringing();
        nokia.vibrating();
        
    }
}
