public class Room {
    private double length;
    private double breadth;

    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Room(double side) {
        this.length = side;
        this.breadth = side;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            double length = Double.parseDouble(args[0]);
            double breadth = Double.parseDouble(args[1]);
            Room rectangleRoom = new Room(length, breadth);
            System.out.println("Room is a rectangle with length = " + rectangleRoom.getLength() + " and breadth = "
                    + rectangleRoom.getBreadth());
        } else if (args.length == 1) {
            double side = Double.parseDouble(args[0]);
            Room squareRoom = new Room(side);
            System.out.println("Room is a square with side = " + squareRoom.getLength());
        } else {
            System.out.println("Invalid number of arguments.");
        }
    }
}
