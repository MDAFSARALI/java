// This problem has the error of:Error: Could not find or load main class CWH_exercise_05
// Caused by: java.lang.NoClassDefFoundError: com/codewithharry/shape/CWH_exercise_05 (wrong name: CWH_exercise_05)
// After removing the package we are able to run this program matlab error packaging me hi hai....
// We have to create diffrent class in diffrent files...not in the same the remaining classes will extends shape class and shape class also have constructor so we have to create all constructor in all like square,rectangle...etc 
// If problem prefer to Code with harry lecture 77 
package com.codewithharry.shape;
class Rectangle{
    int length;
    int breadth;
    float pi=3.14f;
   public void Rect_set(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
   }
   public void Rect_get(){
        System.out.println("The length of the rectangle is : "+length);
        System.out.println("The breadth of the rectangle is : "+breadth);
   }
   public void Rect_volume(){
        System.out.println("The volume of the rectangle is :"+(length*breadth));
   }
   public void Rect_surface_area(int weidth){
    System.out.println("The area of the rectangle is :"+(length*weidth));
}

}
class Square extends Rectangle{
    int side;
    public void Square_set(int length){
        this.side=length;
        
       }
       public void Square_get(){
            System.out.println("The length of the side of square is : "+side);
       }
       public void Square_volume(){
            System.out.println("The volume of the Square is :"+(side*side));
       }
       public void Square_surface_area(int weidth){
        System.out.println("The area of the Square is :"+(side*weidth));
    }

}
class Circle extends Square{
    float radius;
    public void Circle_set(float r){
        this.radius=r;
        
       }
       public void Circle_get(){
            System.out.println("The radius of the circle is :  "+radius);
       }
       public void Circle_volume(){
            System.out.println("The volume of the Circle is :"+((4/3)*pi*radius*radius*radius));
       }
       public void Circle_surface_area(){
        System.out.println("The volume of the Circle is :"+(pi*radius*radius));
    }

}
class Cylinder extends Circle{
    float radius;
    float height;
    public void Cylinder_set(float radius,float height){
        this.radius=radius;
        this.height=height;       
       }
       public void Cylinder_get(){
            System.out.println("The radius of the Cylinder is :  "+radius);
            System.out.println("The height of the Cylinder is :  "+radius);

       }
       public void Cylinder_surface_area(){
        System.out.println("The volume of the Cylinder is :"+((2*pi*radius*height)+(2*pi*radius*radius)));
    }

}
class Sphere extends Cylinder{
    float radius;
    public void Sphere_set(float r){
        this.radius=r;
        
       }
       public void Sphere_get(){
            System.out.println("The radius of the Sphere is :  "+radius);
       }
       public void Sphere_volume(){
            System.out.println("The volume of the Sphere is :"+((4/3)*pi*radius*radius*radius));
       }
       public void Sphere_surface_area(){
        System.out.println("The volume of the Sphere is :"+(pi*radius*radius));
    }
}
class CWH_exercise_05 {
    public static void main(String[] args) {
        Sphere s=new Sphere();
        s.Rect_set(1, 2);
        s.Rect_get();
        s.Rect_volume();
        s.Rect_surface_area(3);
        System.out.println("--------------------");
        
        
    }
}
