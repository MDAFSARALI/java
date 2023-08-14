import java.util.HashSet;

public class CWH_lect_95_HashSet {
    // https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/HashSet.html
    // https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/LinkedHashSet.html
    public static void main(String[] args) {
        // set :Repeatation is not allowed
        // HashSet(Aisa hash jise repetation allow nahi ho...)
        // Load factor:Hash table doubles(capacity increases)
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);

    }
}
