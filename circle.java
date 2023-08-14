class circle {
    float pi = 3.14f;
    float radius;
    float arc;

    void setRadius(float rad) {
        radius = rad;
    }

    float calculateArea() {
        float area = pi * radius * radius;
        return area;
    }

    float circleCircumferance() {
        float circleCircumferance = 2 * pi * radius;
        return circleCircumferance;
    }

    float arclength(float angle) {
        arc = angle;
        float new_arc = arc * radius;
        return new_arc;
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.setRadius(10);
        System.out.println("The area of the circla having radius 3 is :" + c.calculateArea());
        System.out.println("The circumferance of the circle of radius 10 is " + c.circleCircumferance());
        System.out.println("The arclength of the circle having angle 45 edgree and radius 10 is " + c.arclength(45));
    }
}
