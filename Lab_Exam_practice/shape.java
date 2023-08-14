public class shape {
    float radius;
    int x, length, breadth, height;

    shape(int side) {
        this.length = side;
        this.breadth = side;
        this.x = side;
    }

    shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    shape(float radius) {
        this.radius = radius;
    }

    float calculate_Area_rectangle() {
        return length * breadth;
    }

    // float culate_Area_sqaure() {
    // return side * side;
    // }

    float calculate_Area_of_triangle() {
        return (float) (length * breadth * height * 0.5);
    }

    float calculate_Area_of_circle() {
        return (float) (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        int length, breadth, x, height;
        float radius;
        length = Integer.parseInt(args[0]);
        breadth = Integer.parseInt(args[1]);
        height = Integer.parseInt(args[2]);
        x = Integer.parseInt(args[3]);
        radius = Float.parseFloat(args[4]);
        shape square = new shape(x);
        shape triangle = new shape(length, breadth, height);
        shape rectangle = new shape(length, breadth);
        shape circle = new shape(radius);
        System.out.println("The length=" + rectangle.length + " breadth= " + rectangle.breadth + " area= "
                + rectangle.calculate_Area_rectangle());
        System.out.println("The side of the square= " + square.x + " area " + square.calculate_Area_rectangle());
        System.out.println("The length=" + triangle.length + " breadth= " + triangle.breadth + " height= "
                + triangle.height + " area is = " + triangle.calculate_Area_of_triangle());
        System.out.println(
                "The radius of the circle  " + circle.radius + "  and area is : " + circle.calculate_Area_of_circle());

    }
    // Where x is side for same name confusion i have changed it...
}
