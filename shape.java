public class shape {
    int length;
    int breadth;
    int side;
    int height;
    double radius;
   shape(int length,int breadth,int side,int height,double radius){
    this.length=length;
    this.breadth=breadth;
    this.side=side;
    this.height=height;
    this.radius=radius;
   }
   public int square(){
    int area= side*side;
    return area;
   }
   public int rectangle(){
    int area= length*breadth;
    return area;
   }
   public double trangle(){
    double area= 0.5*length*height;
    return area;
   }
    public void calArea(){
        
    }
    public static void main(String[] args) {
        
    }
}
