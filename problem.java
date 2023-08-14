public class problem {
    static int a=10;
    static int b=5;
    public void add(){  
        System.out.println("The addition of a and b is :"+(a+b));
    }
    public void sub(){
        System.out.println("The addition of a and b is :"+(a-b));
    }public void mul(){
        System.out.println("The addition of a and b is :"+(a*b));
    }public void dev(){
        System.out.println("The addition of a and b is :"+(a/b));
    }
public static void main(String[] args) {
    problem p=new problem();
    p.add();
    p.sub();
    p.mul();
    p.dev();
}
}
