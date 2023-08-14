class circle{
    public double initialize (double d){
        double a=d;
        return a;
    }
    public float area(Float radius){
        return (float) (3.14*radius*radius);
    }
    public float perimeter(float radius){
        return  (float)(2*3.14*radius);
    }
}



public class CWH_ch_08_pr_06 {
    public static void main(String[] args) {
        circle circle1=new circle();
        System.out.println("The radius of the circle is :"+circle1.initialize(10.0));
        System.out.println("The area of the circle is :"+circle1.area(10.0f));
        System.out.println("The perimeter of the circle is : "+circle1.perimeter(10.0f));
        
    }
}
