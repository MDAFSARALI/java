public class Employee {
    String name;
    String Address;
    int age;
    String gender;

    Employee(String name, String Address, int age, String gender) {
        this.name = name;
        this.Address = Address;
        this.age = age;
        this.gender = gender;

    }

    public void display() {
        System.out.println("The name of the employee is " + name);
        System.out.println("The adress of the employee is " + Address);
        System.out.println("The age of the employee is " + age);
        System.out.println("The gender of the employee is " + gender);
    }

    class fullTime extends Employee {
        int salary;
        String designatio;

        fullTime(String name, String Address, int age, String gender) {
            super(name, Address, age, gender);
            super.display();
        }
        void display(int salary){
            this.salary=salary;
            System.out.println("Your salary is :"+salary);
            System.out.println("This is your destignation...");
        }
    }
    class partTime extends Employee{
        partTime(String name, String Address, int age, String gender) {
            super(name, Address, age, gender);
        }
        int workingHour;
        int rateperHour;
        public void calculatepay(int workingHour,int rateperHour){
            this.workingHour=workingHour;
            this.rateperHour=rateperHour;
            
        }
        public void display(){
            System.out.println("The total amount will be pay to use is :"+(rateperHour*workingHour));
        }
    }

    public static void main(String[] args) {
        Employee e=new Employee("Afsar", "Loot bagan", 19, "Male");
        e.display();

    }

}
