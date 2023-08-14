public class Room {
    int length;
    int breadth;
    int side;

    Room(int x, int y) {
        this.length = x;
        this.breadth = y;
    }

    Room(int side) {
        this.side = length = breadth = side;
    }

    int Area() {
        return (length * breadth);
    }

    public static void main(String args[]) {
        int length, breadth, side;
        length = Integer.parseInt(args[0]);
        breadth = Integer.parseInt(args[1]);
        side = Integer.parseInt(args[2]);
        Room r1 = new Room(length, breadth);
        Room r2 = new Room(side);
        System.out.println(
                "The area of rectangle with length " + r1.length + " breadth " + r1.breadth + " is " + r1.Area());
        System.out.println("The area of square with side " + r2.side + " is: " + r2.Area());
    }
}
