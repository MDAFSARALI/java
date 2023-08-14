class A{
    public int  a ;
    public int harry(){
        return 4;
    }
    public void metd2(){
        System.out.println("I am the method 2 of class A");
    }
}
class B  extends A{
    @Override        //It is not necessary to write it but it is a best method to override...
    public void metd2(){//This is method overriding.....
        System.out.println("I am the method 2 of class B: ");
    }
    public void metd3(){
        System.out.println("I am the method 3 of class b: ");
    }
}
public class CWH_lect_48_method_overriding {
    public static void main(String[] args) {
        // A a= new A();
        // a.metd2(); 
        
        B b=new B();
        b.metd2();
    }
}
