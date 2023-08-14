class base{
    base(){
        System.out.println("This is the constructor of base...");
    }
}
class derived1 extends base{
    derived1(){
        System.out.println("This is the constructor of derived 1...");
    }
}
class derived2 extends derived1{
    derived2(){
        System.out.println("This is the constructor of derived 2...");
    }
}



public class CWH_ch_10_pr_05 {
    public static void main(String[] args) {
        // derived2 obj=new derived2();//The call of the constructor in the base-->derived1-->derived2 order//
    }
}
