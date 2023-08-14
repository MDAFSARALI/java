abstract class parent2{
    public parent2(){
        System.out.println("I am the constructor of base2...");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
        //Agar isko implement karna hai to isko iski derived class bana kar implement karlo...
  
}
class child2 extends parent2{
    @Override
    public void greet1(){
        System.out.println("Good morning......(^_^)");
    }
    @Override
    public void greet2(){
        System.out.println("Good evening......(^_^)");
    }
}
abstract class child3 extends parent2{
public void th(){
        System.out.println("I am good...");
    }
}

public class CWH_lect_53_abstract_class_and_method {
    public static void main(String[] args) {
        // child2 c=new child2();
        // parent2 p=new parent2();//---------->Error bcz abstract ka object create nahi kar sakte..
        
        
    }
}
// Ak machli pure talab ko ganda kar deti hai means agar ak class ke andar ak bhi abstract method hoga to pura class ko abstract karna padega...
// abstract class ka object nahi banta hai....




