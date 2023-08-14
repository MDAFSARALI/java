import java .util.*;
// To learn more refer it:
// https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/concurrent/CopyOnWriteArrayList.html
public class CWH_lect_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>L1=new ArrayList<>();// <> this is a generic it means that which parameter we want to supply..
        L1.add(6);
        L1.add(7);
        L1.add(4);
        L1.add(0,8);// Here index means where we want to add the item...
        L1.add(0,3);
        
        ArrayList<Integer>L2=new ArrayList<>(5);
        L2.add(11);
        L2.add(12);
        L2.add(13);
        L2.add(14);
        L2.add(15);
        L2.add(15);
        L2.add(15);
        

        L1.set(1, 1200);
        
        // L1.addAll(0,L2);// Here 0 is index:It's means that the L1 will add L2 in L1 from starting index 
        // If we want to add L2 at last then no need to add index... 
        L1.addAll(L2);
        System.out.println(L1.contains(27));// If 7 is present in L1 If true means yes exist otherwise false...
        System.out.println(L1.indexOf(7));//Starting from Zero means the 7 is present at position 4/// ye pehle wale index ko leta hai...
        System.out.println(L1.lastIndexOf(7));
        /* "Printing the ArrayList of the L1 is :"
        3
        8
        6
        7
        4*/
        // This line will add the item L2 in L1 at last...---->This is the same method in python as a append..This is appending
        for (int i = 0; i < L1.size(); i++) {
            System.out.println(L1.get(i));
            
        }
        //L1.clear();// This function will clear the ArrayList items from the ArrayList...
        //  L1.addAll(L2);// This line will add the item L2 in L1 at last...---->This is the same method in python as a append..This is appending
        // for (int i = 0; i < L1.size(); i++) {
        //     System.out.println(L1.get(i));
            
        // }
        System.out.println(L1.isEmpty());


    }
}