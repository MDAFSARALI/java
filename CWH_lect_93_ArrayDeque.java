import java.util.ArrayDeque;
// https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/ArrayDeque.html
public class CWH_lect_93_ArrayDeque {
    public static void main(String[] args) {
        // Deque------->Double ended Queue
        // Insertion from the last 
        // Deletion from the first 
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);// Adds the item at the last of the array
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(0);
        // ad1.offerFirst(20000);
        ad1.addLast(30);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());


    }
}
