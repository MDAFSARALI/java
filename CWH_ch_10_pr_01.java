class circle{
    double radius;
    circle(Double r){
        System.out.println("I am circle parametrized constructor");
        this.radius=r;
    }
    public void method1(){
        System.out.println("This is the method of circle...");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    cylinder(double h,double r){ 
        super(r);
        System.out.println("I am the constructor of cylinder...");
    }
    double height;
    public void method2(){
        System.out.println("This is the method of cylinder...");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class CWH_ch_10_pr_01 {
    public static void main(String[] args) {
        // cylinder c1=new cylinder();
        // c1.method1();
        // c1.method2();
        // c1.area();
        // circle objc=new circle(5.0);
        // cylinder c1=new cylinder(12, 4);

        
    }
}
