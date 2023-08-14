class circle {
    Float a;

    public float cir_area(Float radius) {
        this.a = radius;
        return (float) (Math.PI * a * a);
    }

    public float cir_vol() {
        return (float) ((4* Math.PI * a * a * a)/3);
    }
}

class cylinder extends circle {
    float a;
    float b;

    public float cyl_area(float radius, float height) {
        this.a = radius;
        this.b = height;

        float area = (float) (2 * Math.PI * a * b + 2 * Math.PI * a * a);
        return area;

    }

    public float cyl_vol() {
        float vol = (float) (Math.PI * a * a * b);
        return vol;
    }
}

public class CWH_ch_10_pr_03 {
    public static void main(String[] args) {
        cylinder cl=new cylinder();
        System.out.println(cl.cir_area(3.0f));
        System.out.println(cl.cir_vol());
        System.out.println(cl.cyl_area(3.0f, 2));
        System.out.println(cl.cyl_vol());

    }
}
