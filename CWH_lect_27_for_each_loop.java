public class CWH_lect_27_for_each_loop {
    public static void main(String[] args) {
        // int [] marks={100,70,80,71,98};
        // float [] marks={100.1f,70.7f,80.87f,71.02f,98.98f};
        // System.out.println(marks[0]);
        // System.out.println(marks.length);// Length of the array is throw by .length
        // function

        /*
         * String [] students={"Harry","Afsar","Afzal","faishal"};
         * System.out.println(students.length);
         * System.out.println(students[1]);
         */
        int[] marks = { 100, 70, 80, 71, 98 };
        // System.out.println("Printing using normal way: ");
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // This is the second easy method:-----------------------
        /*
         * System.out.println("Printing using for loop");
         * for (int i=0 ;i< marks.length;i++) {
         * System.out.println(marks[i]);
         * }
         */
        // This is the second easy method:-----------------------
        System.out.println("Printing using for each loop......");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
