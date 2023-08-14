class animal{
    public void c(){
        System.out.println("This is the characteristics of the animal...");
    }
}
 class dog extends animal{
    public void sound(){
        System.out.println("Dog baks.....");
    }
 }





public class CWH_lect_45_quick_quiz {
    public static void main(String[] args) {
        dog d=new dog();
        d.c();
        d.sound();
    }
}
