import java.util.Scanner;
public class Rectangle1 {
    private int length;
    private int breadth;
    
    public void getData(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int rectArea() {
        return length * breadth;
    }
    
    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1();
        Rectangle1 rect2 = new Rectangle1();
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the length and breadth of Rectangle1: "); 
        int l1=sc.nextInt();
        int b1=sc.nextInt();
        System.out.println("Enter the length and breadth of Rectangle2: "); 
        int l2=sc.nextInt();
        int b2=sc.nextInt();
        // Initialize the data members using getData method
        rect1.getData(l1, b1);
        rect2.getData(l2, b2);
        //////////////////////////////////////////////////////////////////////////
        
        // Calculate the area of the two rectangles using recytArea method
        int area1 = rect1.rectArea();
        int area2 = rect2.rectArea();
        
        // Print the areas of the two rectangles
        System.out.println("Area of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);
        sc.close(); 
    }
}

  
