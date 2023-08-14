class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int rectArea() {
        return length * breadth;
    }
}

public class Rectangle2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(15, 25);

        System.out.println("Area of Rectangle 1: " + rect1.rectArea());
        System.out.println("Area of Rectangle 2: " + rect2.rectArea());
    }
}
