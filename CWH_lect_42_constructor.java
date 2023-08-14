class MyEmployee {
    private int id;
    private String name;

    public MyEmployee(){//Constructor ka name class ke name hi rahega and
    // constructor automatically invoke ho jata hai...
     id=10;
     name="Your_name_here";
     }
    // Class ke name ka method ko constructor kehte hai.......
    public MyEmployee(String myname, int i) {
        name = myname;
        id = i;
    }

    public MyEmployee(String myname) {
        name = myname;
        
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        this.name = n;
    }

    public int getid() {
        return id;
    }

    public void setid(int i) {
        this.id = i;
    }

}

public class CWH_lect_42_constructor {
    public static void main(String[] args) {
        // MyEmployee afsar = new MyEmployee("AFZAl", 20);// Ye usko use karega jisme arguments pass kia gya ho...
        // MyEmployee afsar = new MyEmployee();//Ye line 5 ko use karega 
        MyEmployee afsar = new MyEmployee("Faishal");
        // afsar.setname("AFSAR ALI");
        // afsar.setid(10);
        // Constructor---->Banate ke sath hi initialize kardo...
        // System.out.println(afsar.getid());
        System.out.println(afsar.getname());

    }
}
