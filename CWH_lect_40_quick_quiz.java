class circle{
    private float radius ;
    public float getradius(){
        return radius;
    }
    public void setradius(int i){
        this.radius= i;
    }
    public void area(){
        System.out.println("The area of the circle is "+(3.14*radius*radius));
    }
    public void perimeter(){
        System.out.println("The perimeter of the circle is "+(2*3.14*radius));
    }
    
}


public class CWH_lect_40_quick_quiz {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.setradius(5);
        System.out.println(c1.getradius());
        c1.area();
        c1.perimeter();

    }
}
