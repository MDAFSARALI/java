interface camera{
    void takeSnap();
    void recordVideo();
    default void record4k(){
        System.out.println("Recording in 4k");//Default method to add this method in all the classes thats why we have to use default keyword it is introduce after java 8.0
    }
}
interface wifi{
    String []getNetwork(String network);
}
class cellPhone {
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting....");
    }
    // private void greet(){
    //     System.out.println("Good morning...");
    // }
}
class smartPhone extends cellPhone implements wifi,camera{
   public  void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Recording the video....");
    }
    public String [] getNetwork(String Network){
        System.out.println("Getting list of networks...");
        String[] NetworkList={"Harry","Afsar","Afzal"};
        return NetworkList;
    }
    public void connectTonetwork(String Network){
        System.out.println("connecting to"+Network);
    }
    public  void record4k(){
        System.out.println("Taking snap and recording in 4k");//Default method
    }
    // Here we have re implented aga ab run karenge to 40.0k wala run hoga 
}
public class CWH_lect_56_multiple_inheritance {
    public static void main(String[] args) {
        smartPhone ms=new smartPhone();
        String [] arr=ms.getNetwork("Afsu");
        // System.out.println(arr);
        ms.record4k();
        for (String item : arr) {
            System.out.println(item);
            
        }
    }
}
// Multiple inheritance is not allowed in java matlab ak se jyada parent se ak child class nahi bana sakte....
// But we can use multiple inheritance using interfaces...
// Interfaces ke andar methods ko define karna jaroori hai but properties ko phir se likhne ka jaroorat nahi hai jaise int x=45 etc.
// (no need to override the properties...)
