import java.util.Scanner;
public class Rectangle_using_constructor {
    int length;
    int breadth;
    Rectangle_using_constructor(int x,int y){
        this.length=x;
        this.breadth=y;
    }
    void Area(){
        System.out.println("The area of the rectangle with length= "+length+" breadth"+ breadth+" is "+(length*breadth));
    }
    public static void main(String args[]){
        int x,y;
        System.out.println("Please neter the value of length and breadth: ");
        Scanner sc=new Scanner(System.in);
        y=sc.nextInt();
        x=sc.nextInt();
        Rectangle_using_constructor R03=new Rectangle_using_constructor(x, y);
        R03.Area();
        sc.close();
    }
}
