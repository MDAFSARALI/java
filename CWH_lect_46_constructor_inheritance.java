class base1 {
    public int x;
    base1(){
        System.out.println("I am a constructor..");

    }
    
    base1(int a){
        System.out.println("I am a constructor..with valus of a as ");

    }
}

class derived1 extends base1 {
    public int y;
    derived1(){
        // super(5);
        // super();
        System.out.println("I am the constructor of derived class...");
    } 

    derived1(int x ,int y){
        System.out.println("I am a overloaded constructor of derived class with value of x and y ");
    }
}

public class CWH_lect_46_constructor_inheritance {
    public static void main(String[] args) {
        // base1 b1=new base1();//Jaise hi object creation hota hai waise hi constructor run karta hai..
        // b1.getterx();
        // derived1 d1 = new derived1();// here also the constructor will run....

    }
}
