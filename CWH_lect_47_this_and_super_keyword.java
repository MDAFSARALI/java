class akclass {
    int a;
    public akclass(int v) {
        this.a = v;
    }
    public int returnone() {
        return 1;
    }
    public int getA() {
        return a;
    }
}
class doclass extends akclass {

    doclass(int c) {
        //  It is being use here to declare it that i dont want to call this constructor
        super(c); // i want to call the constructor of base class...
        // ye super key word base class ke aise method ko dhunde ga jo ak integer leta
        // ho...
        System.out.println("Mai ak constructor hu...");
    }
}

public class CWH_lect_47_this_and_super_keyword {
    public static void main(String[] args) {
        akclass e = new akclass(65);
        // doclass d=new doclass(5);
        System.out.println(e.getA());
    }
}
