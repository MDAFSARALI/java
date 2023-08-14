public class Telusko {
    public static void main(String[] args) {
        // teacher t=new teacher(10, null, null, 0, 0);
        // t.display();
        // t.resignation();
        // t.special("Math");
        // mployee m=new mployee(0, null, null, 0, 0);
        // m.display();
        officeboy b=new officeboy(0, null, null, 0, 0);
        b.display();
        b.resignation();

    }
}
class mployee {
    int employee_code;
    String employee_name;
    String address;
    long phone;
    float DA=10;
    float HRA=20;
    int salary;
    mployee(int employee_code,String employee_name,String address,long phone,int salary){
        this.employee_code=employee_code;
        this.employee_name=employee_name;
        this.address=address;
        this.phone=phone;
        this.salary=salary;
    }
    void display(){
        System.out.println("My name is:"+employee_name);
        System.out.println("My code is :"+employee_code);
        System.out.println("My address is :"+address);
        System.out.println("My phone number is :"+phone);
        System.out.println("My salary is:"+salary);
        System.out.println("Your total pay is :"+(salary+((DA*salary)/100)+((HRA*salary)/100)));
    }
}
class teacher extends mployee{
    teacher(int employee_code,String employee_name,String address,long phone,int salary){
        super(employee_code, employee_name, address, phone, salary);
    }
    void special(String sub){
        System.out.println("I am th especial of : "+sub);
    }
    void resignation(){
        System.out.println("I am resigning....");
    }
}
class officeboy extends mployee{
    officeboy(int employee_code,String employee_name,String address,long phone,int salary){
        super(employee_code, employee_name, address, phone, salary);
    }
    void resignation(){
        System.out.println("I am resigning....");
    }
}

