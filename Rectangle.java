import java.util.Scanner;
public class Rectangle {
    float length=0;
    float weidth=0;
    public void set(float l,float b){
        if ((l>0.0f || l<=20.0) && (b>0.0 ||b<=20.0f)) {
            System.out.println("Yes the entred values are correct:"); 
            length=l;
            weidth=b;
        }
        else{
            System.out.println("No the entred value are not correct");
        }
    }
    public void  get(){
        System.out.println("The lenght of the rectangle is "+length);
        System.out.println("The lenght of the rectangle is "+weidth);

    }
    public float area(){
        return length*weidth;
    }
    public float perimeter(){
        return 2*(length+weidth);
    }
    public static void main(String[] args) {
        System.out.println("Please enter the value of length and breadth in float (under 0.0 to 20.0)");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        Rectangle r=new Rectangle();
        r.set(a, b);
        r.get();
        sc.close();
        System.out.println(r.area());
        System.out.println(r.perimeter());

        
    }
}
