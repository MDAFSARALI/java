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
}public class CWH_ch_11_pr_05 {
    public static void main(String[] args) {
        // Monkey m=new Monkey();
        // m.Bite();
        // m.jump();
        // Monkey m=new Human();
        // m.Bite();
        // m.jump();
        Human h=new Human();
        h.Bite();h.eat();h.sleep();h.jump();
        Monkey m1=new Human();
        m1.Bite();m1.jump();
        // m1.speak();--->Can not use speak method becuase the referance is monkey and monkey does not contain speak method only human class can speak...
        BasicAnimal b=new Human();
        b.eat();b.sleep();
    }
}
