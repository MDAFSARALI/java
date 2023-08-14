class Employee {
    int salary;
    String Name;

    public void print_Details() {
        System.out.println("My name is " + Name);
        System.out.println("My salary is " + salary);
    }

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return Name;
    }

    public String setname(String name, String name2) {
        return name2;
    }

}

public class CWH_ch_08_pr_01 {
    public static void main(String[] args) {
        Employee afsar = new Employee();
        afsar.salary = 100;
        afsar.Name = "AFZAL ALI KHAN";
        afsar.print_Details();
        int x=afsar.getsalary();
        System.out.println(x);
        String name=afsar.getname();
        System.out.println(name);
        String name2=afsar.setname("faishal","kausar");
        System.out.println("My new name is "+name2);

    }
}
