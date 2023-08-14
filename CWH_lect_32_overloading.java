public class CWH_lect_32_overloading {
    static void foo(){
        System.out.println("Good Morning bro !");
    }
    static void foo(int a){
        System.out.println("Good morning "+a+" bro");
    }
    static void foo(int a,int b){//Here a and b are para meters 
        System.out.println("Good morning "+a+" bro");
        System.out.println("Good morning "+b+" bro");

    }
    // static void tellJoke() {
    //     System.out.println("Here I am telling joke...");
    // }
    // static void change(int a){
    //     a=98;
        
    // }
    // static void change2(int []arr){//Yaha array ka referance gaya hai isi liye totalarray change ho jayega integer ke case me integer ka shirf copy gaya tha yaha pura address hi chala gaya hai  
    //     arr[0]=98;
        
    // }


    public static void main(String[] args) {
        // tellJoke();
        
        //  CASE-------01: Changing the integer...
        // int x=45;
        // change(x);
        // System.out.println(x+ " "+ "After running .......");



        //  CASE-------02: Changing the array...
        // int [] marks={52,73,77,89,98,94};
        // change2(marks);
        // System.out.println( " "+ "marks of 0th index after changing is "+marks[0]);//Array updation done....



// Concept of method overloading ------------------>
            foo();
            foo(300);
            foo(3000,4000);//3000 and 4000 are arguments...
//  Arguments are actual !!!
// The method overloading can not be performed by changing the returns type of method..



    }
}
