public class CWH_lect_26_array {
    public static void main(String[] args) {
        // Classroom of 500 students:
        // -----------------------Method 01-------------

        int[] marks = new int[5];// -----------Declaration + memory allocation simulataneously.
        // WHY DO WE USE ARRAY:
        // Because accessing the element in an array is faster...
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        marks[4] = 96;// Updation of marks of index 4
        // marks[4]=96;----------->Overriding happen here...
        System.out.println(marks[4]);
        // marks[5]=92;---->Index 5 out of bounds for length 5
        // System.out.println(marks[5]);--->Throw an error----->Index 5 out of bounds
        // for length 5

        // -----------------------Method 02-------------
        // int marks----------->Declaration

        // marks = new int [5] ;----------->array creation....|| Memory allocation..
        // Initialization :
        // marks[0]=100;
        // marks[1]=60;
        // marks[2]=70;
        // marks[3]=90;
        // marks[4]=86;
        // -----------------------Method 03-------------
        // int [] marks={100,70,80,71,98}-------------->Declaration and initialaization
        // happen simulataneously....
        // System.out.println(marks[4]);

    }
}
