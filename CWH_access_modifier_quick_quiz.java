class salary {
    int salary;

    public int new_salary() {
        salary = 1000;
        return salary;
    }
}

public class CWH_access_modifier_quick_quiz {
    public static void main(String[] args) {
        salary afsar = new salary();
        System.out.println(afsar.new_salary());

    }

}
