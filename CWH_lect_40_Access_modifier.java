class MyEmployee {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        // name = n;--->Ye bhi sahi hai
        this.name = n;// -->Ye bhi sahi hai.
    }

    public void setid(int i) {
        // id = i;--->Ye bhi sahi hai
        this.id = i;// -->Ye bhi sahi hai.
    }

    public int getid() {
        return id;
    }

}

public class CWH_lect_40_Access_modifier {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;------------------------->Throws an error due toprivate access
        // modifier
        // harry.name = "Code with harry";--------->Throws an error due toprivate access
        // modifier
        harry.setname("Code with harry");
        harry.setid(100);
        System.out.println(harry.getname());
        System.out.println(harry.getid());
    }
}
