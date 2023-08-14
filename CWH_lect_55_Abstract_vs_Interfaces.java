interface Bicyle{
    final int a=45;//We can write the final keyword and not its our choice...
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface hornBicycle  {
    void BlowHornK3G();
    void BlowHornMaihuna();  
}
class AvoneCycle implements Bicyle,hornBicycle{
    void BlowHorn(){
        System.out.println("Pi pi....");
    }
     public void applyBreak(int decrement){
        System.out.println("I am applying break...");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp...");
    }
    public void BlowHornK3G(){
        System.out.println("kabhi khushi kabhi gam....pi pi pi pi");
    }
    public void BlowHornMaihuna(){
        System.out.println("Mai hu na ....po po po");
    }
}
// Interfaces ke methods ko implement karna padega and sath hi use public bhi karna padega....
public class CWH_lect_55_Abstract_vs_Interfaces {
    public static void main(String[] args) {
        AvoneCycle cycleharry=new AvoneCycle();
        // cycleharry.applyBreak(1);
        // System.out.println(cycleharry.a);//You can creates in interfaces...
        // You can not modify the properties in Interfaces because they are final...
        // cycleharry.a=455;-------->Error 
        cycleharry.BlowHornK3G();
        cycleharry.BlowHornMaihuna();

    }
}
/* Abstarct class ak se jyada use nahi kar sakte but interfaces koak se jyada bari use kar sakte hai matlab k se jayada martaba interfaces bana skte hai */
