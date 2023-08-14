public class Rectangle_02 {
    int length;
    int breadth;
    void getData(int x,int y){
        this.length=x;
        this.breadth=y;
    }
    int Area(){
        return (length*breadth);
    }
  public static void main(String[] args) {
    int x=Integer.parseInt(args[0]);
    int y=Integer.parseInt(args[1]);
    Rectangle_02 R02=new Rectangle_02();
    R02.getData(x, y);
    System.out.println("The entered length= "+R02.length+" and breadth= "+R02.breadth);
    System.out.println("The area of the rectangle is "+(R02.Area()));
  }  
}
