class rectangle {
    int a, b, c;

    public void rec_set(int length, int breadth) {
        this.a = length;
        this.b = breadth;
    }

    public int rec_area() {
        return a * b;
    }

    public int rec_vol(int height) {
        this.c = height;
        return a * b * c;

    }

    public void rec_get() {
        System.out.println("The lenght" + a + " and braedth size is " + b);
    }

    public void set(float a2, float b2) {
    }

    public void get() {
    }

    public char[] area() {
        return null;
    }

    public char[] perimeter() {
        return null;
    }
}

class cuboid extends rectangle {
    public void cub_set(int length, int breadth, int weidth) {
        this.a = length;
        this.b = breadth;
        this.c = weidth;
    }

    public int cub_area() {
        int sa = 2 * a * b + 2 * b * c + 2 * c * a;
        return sa;
    }

    public int cub_vol(int weidth) {
        this.c = weidth;
        return a * b * c;
    }

    @Override
    public void rec_get() {
        System.out.println("The lenght" + a + " and braedth size is " + b + "weidth is " + c);
    }
}

public class CWH_ch_10_pr_04 {
    public static void main(String[] args) {
        cuboid cbd = new cuboid();
        cbd.cub_set(1, 2, 3);
        cbd.rec_get();
        cbd.rec_set(2, 5);
        System.out.println(cbd.cub_area());
        System.out.println(cbd.cub_vol(2));
        System.out.println(cbd.rec_area());
        System.out.println(cbd.rec_vol(2));
        cbd.rec_get();
    }
}
