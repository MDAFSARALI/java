import java.util.ArrayList;

public class CWH_ch_15_pr_01 {
    public static void main(String[] args) {
        ArrayList <String> student=new ArrayList<>(10);
        student.add("A");
        student.add("B"); 
        student.add("C");
        student.add("D");
        student.add("E");
        student.add("F");
        student.add("G");
        student.add("H");
        student.add("I");
        student.add("J");
        for (String string : student) {
            System.out.println(string);
        }

    }
}
