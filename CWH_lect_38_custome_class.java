class employee {
    // any real world object =properties+behaviour;
    // Object in OOPs=attribute + methods...
    int id; // --------->Attribute 01
    String name;// --------->Attribute 02
    int salary;

    public void print_Details() {
        System.out.print("My id is " + id);
        System.out.print(" and my name is " + name);
        System.out.println(" my salary is "+salary);
    }
    public int getsalary(){
        return salary;
    }
    public void Employee() {
    }
}

public class CWH_lect_38_custome_class {

    public static void main(String[] args) {
        System.out.println("This is our custome class..");
        employee harry = new employee();// Instantiating a new employee object....
        // Setting attributes/properties....INITIALIZING

        employee afsar = new employee();
        harry.id = 10;
        harry.name = "Code with harry";
        harry.salary=20;
        afsar.id = 100;
        afsar.name = "Akbar";
        afsar.salary=500;
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        int salary=afsar.getsalary();
        System.out.println(salary);
        harry.print_Details();
        afsar.print_Details();
    }
}
