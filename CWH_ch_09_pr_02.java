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

    public double surface_area() {
        // A=2πrh+2πr2
        double area = (2 * 3.14f * radius * height) + (2 * 3.14f * radius * radius);
        return area;
        // Instead of 3.14 we can also use  Math.PI
       
    }

    public double volume() {
        // V=πr2h
        double volume = (3.14f * radius * radius * height);
        return volume;
    }
}

public class CWH_ch_09_pr_02 {
    public static void main(String[] args) {
        cylinder cylinder1 = new cylinder();
        cylinder1.rad_getter(5);
        int a = cylinder1.rad_setter();
        System.out.println("The radius of the cylinder is :" + a);
        cylinder1.height_getter(25);
        int b = cylinder1.height_setter();
        System.out.println("The height of the cylinder is : " + b);
        double surface_area = cylinder1.surface_area();
        System.out.println("The surface area of the cylinder is :" + surface_area);
        double volume = cylinder1.volume();
        System.out.println("The volume of the cylinder is :" + volume);
    }
}
