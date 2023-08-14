class cylinder {
     private int radius;
     private int height;

    public void rad_getter(int new_radius) {
        radius = new_radius;
    }

    public int rad_setter() {
        return radius;
    }

    public void height_getter(int new_heigth) {
        height = new_heigth;
    }

    public int height_setter() {
        return height;
    }
}

public class CWH_ch_09_pr_01 {
    public static void main(String[] args) {
        cylinder cylinder1 = new cylinder();
        cylinder1.rad_getter(100);
        int a = cylinder1.rad_setter();
        System.out.println("The radius of the cylinder is :" + a);
        cylinder1.height_getter(25);
        int b = cylinder1.height_setter();
        System.out.println("The height of the cylinder is : " + b);

    }
}
