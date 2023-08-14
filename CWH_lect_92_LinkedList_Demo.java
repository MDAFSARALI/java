import java.util.*;
// https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/LinkedList.html
public class CWH_lect_92_LinkedList_Demo {
    public static void main(String[] args) {
        //Linked list me addition of an item and deletion of an item faster hota hai compare to Array or ArrayList
        //Array and ArrayList me execution for finding the value is more faster than linked list...
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();//Linked list me initial capacity nahi dete hai...
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1, 566);
        l1.addLast(25);// Linked List ke last me add karne ka method.
        l1.addFirst(8000);
        l1.removeLast();
        // ArrayList me addLast method nahi hai..
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }





    }
}
