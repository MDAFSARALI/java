import java.util.ArrayList;
// We can also pass T2 but we must have to add Getter and Setter for T2 as well...
class myGeneric<T1>{// Yaha par bhi T2 add karna padega comma dega...
    int val;
    private T1 t1;
    public myGeneric(int val,T1 t1){
        this.val=val;
        this.t1=t1;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
   
}
public class CWH_lect_110_Generics {
    //<>  This is the symbol of generics which is being used to identify or predefine which type of item i will put into array list 
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList();
        // ArrayList<int> arrayList=new ArrayList();----->This line will produce an Error...

        // arrayList.add("String1");
        arrayList.add(54);
        arrayList.add(643);
        // int a=arrayList.get(2);
        // System.out.println(a);
        myGeneric<String> g1=new myGeneric(10, "Mystring is a String ");
        String str=g1.getT1();
        System.out.println(str);





    }
}
