class rectangle{
    public void initialize(int lenght,int breadth){
        int a=lenght;
        int b=breadth;
        System.out.println("The lenght of the triangle is "+a);
        System.out.println("The breadth of the triangle is "+b);
    }
    public int cal_area(int length,int breadth){
        return length*breadth;
    }
    public int perimetere(int length,int breadth){
        return 2*(length+breadth);
    }
        
}



public class CWH_ch_08_pr_04 {
    public static void main(String[] args) {
        rectangle rectangle=new rectangle();
        rectangle.initialize(4,5);
        System.out.println("The area of the rectangle is: "+rectangle.cal_area(4, 5));
        System.out.println("The perimeter of the rectangle is: "+rectangle.perimetere(4, 5));
    }
}
