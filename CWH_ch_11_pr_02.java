abstract class pen {
    abstract void write();

    abstract void refill();

}

class FountainPen extends pen {
    public void write() {
        System.out.println("Writing...");
    }

    public void refill() {
        System.out.println("Refilling...");
    }

    public void changeNib() {
        System.out.println("Changing the size of Nib...");
    }
}

public class CWH_ch_11_pr_02 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.write();
        fp.refill();
    }
}
