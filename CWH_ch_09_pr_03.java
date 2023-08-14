class cylinder{
     private int radius;
     private int height;
    public  cylinder(int r,int h){
        radius=r;
        height=h;
    }
    public void rad_getter(int r) {
        radius=r;
    }
    public int rad_setter() {
        return radius;
    }
    public void height_getter(int h) {
        height=h;
    }
    public int height_setter() {
        return height;
    }
    
    
}





public class CWH_ch_09_pr_03 {
    public static void main(String[] args) {
        cylinder cylinder1=new cylinder(10,2);//This is happening with the help of constructor...
         int a=cylinder1.rad_setter();
         System.out.println(a);
        int b=cylinder1.height_setter();
        System.out.println(b);
        // cylinder1.rad_getter(3);
        // int c=cylinder1.rad_setter();
        // System.out.println(c);
    }
}
