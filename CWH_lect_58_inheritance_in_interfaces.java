interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    // class childSampleInterface extends sampleInterface{ <-----// Here we can not
    // replcae the interface keyword to class ...
    void meth3();

    void meth4();
}

class MySampleClass implements childSampleInterface {
    public void meth3() {
        System.out.println("I am method 3");
    }

    public void meth4() {
        System.out.println("I am method 4");
    }

    public void meth2() {
        System.out.println("I am method 2");
    }

    public void meth1() {
        System.out.println("I am method 1 ");

    }

}

public class CWH_lect_58_inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass m = new MySampleClass();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();
    }
}
