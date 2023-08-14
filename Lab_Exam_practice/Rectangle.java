public class Rectangle {
    int length;
    int breadth;
    void getData(int x,int y){
            length=x;
            breadth=y;
        }
    int Rectangle_area(){
        return (length*breadth);
    }
    public static void main(String args[]){
       Rectangle R1=new Rectangle();
       R1.getData(10,5);
       System.out.println("The Area of rectangle with length="+R1.length+" and breadth="+R1.breadth+" is "+(R1.Rectangle_area())) ;
        
    }
}
