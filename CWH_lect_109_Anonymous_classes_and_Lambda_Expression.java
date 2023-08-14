@FunctionalInterface
interface DemoAno {
    // Lambda expression method which takes an arguments...
     void met1(int a );
    // void met1();
    // void met2();
}
// The below class is used during lambda expression.
// class harryFunc implements DemoAno{

// @Override
// public void met1() {
// System.out.println("This is the method no 1 new wala ....");
// }

// }
// class AnonyDemo implements DemoAno{
// public void display(){
// System.out.println("Hello ...");
// }
// @Override
// public void met1(){
// System.out.println("This is the method no 1: ");
// }
// @Override
// public void met2(){
// System.out.println("This is the method no 2: ");
// }
// }
public class CWH_lect_109_Anonymous_classes_and_Lambda_Expression {

    public static void main(String[] args) {
        // AnonyDemo obj=new AnonyDemo();---->This is the general method
        // obj.met1();
        // By using Anonymous class:(Without using or creating a class..)
        // This is an anonymous class....
        // DemoAno obj1=new DemoAno() {

        // @Override
        // public void met1() {
        // System.out.println("This is the method no 1: ");
        // }

        // // @Override
        // // public void met2() {
        // // System.out.println("This is the method no 2: ");
        // // }
        // };
        // obj1.met1();

        // Concept of Lambda Expressions :
        // DemoAno Hrryfunc=new harryFunc();
        // Hrryfunc.met1();
        // The below codes are the example of lambda function which implements the
        // FunctionalInterface(contain only one unImplemented method):
        // Agar method 1 koi parameter leraha hota to hm log para meter ko () me de sakte hai....
        // DemoAno objdemo = () -> {
        //     System.out.println(
        //             "I am method 1 of interface demo without implementtaion at any class direct implementation...");
        //     System.out.println("This is method 1 of Lambda function...");
        // };
        // objdemo.met1();
        // niche wala method woh hai  jo arguments leta  hai ,,,,
        DemoAno objdemo = (a) -> {
            System.out.println(
                    "I am method 1 of interface demo without implementtaion at any class direct implementation..."+      a);
            System.out.println("This is method 1 of Lambda function...+ "+   a);
        };
        objdemo.met1(10);
        

    }
}
