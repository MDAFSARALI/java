interface BasicAnimal{
    void eat();
    void sleep();

}
class Monkey{
    public void jump(){
        System.out.println("Jumping....");
    }
    public void Bite(){
        System.out.println("Biting...");
    }
   
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Going to eat to servive...");
    }
    public void sleep(){
        System.out.println("Going to sleep....Good night.");
    }
    public void speak(){
        System.out.println("Hello sir!!!");
    }
}
public class CWH_ch_11_pr_03 {
    public static void main(String[] args) {
        // Monkey m=new Monkey();
        // m.Bite();
        // m.jump();
        Human H=new Human();
        H.Bite();
        H.eat();
        H.sleep();
        H.jump();
        H.speak();

    }
}
