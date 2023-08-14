abstract class shape1 {
    public abstract double cal_area();

}

class square extends shape1 {
    int length;
    int breadth;

    square(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double cal_area(){
        return (length*breadth);
    }

}

class circle extends shape1 {
    double radius;

    circle(Double radius) {
        this.radius = radius;
    }

    public double cal_area(){
        return (Math.PI*radius*radius);
    }

}
class shapeDemo{
    public static void main(String[] args) {
        square s=new square(10, 5);
        double sq=s.cal_area();
        System.out.println(sq);
        circle c=new circle(3.000);
        double cr=c.cal_area();
        System.out.println(cr);
    }
}
