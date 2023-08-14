class phone{
    public void name(){
        System.out.println("My name is java...");
    }
    public void greet(){
        System.out.println("Good morning...");
    }
}
class smartphone extends phone{
    @Override
    public void name(){
        System.out.println("My name is java in class 2...");
    }
    public void swagat(){
        System.out.println("Aap ka sawagat hai...");
    }
    public void music(){
        System.out.println("This is music...");
    }
}
public class CWH_lect_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone obj=new phone();
        // obj.name();
        // smartphone smobj=new smartphone();----->The above all are allowed...
        phone obj=new smartphone(); //smartphone ka object banega but iske pas character shirf phone ka hi hai...
        // Super class ka refernace brabar ho skata hai subclass ke referance se...
        // smartphone obj2=new phone();//This produces an error...Not allowed
        //Object ka methods run hoga smartphones ka methods call hoga na ke phone ka..
        obj.greet();
        obj.name();
        
    }
}
