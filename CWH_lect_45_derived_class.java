class kausar{
    int x;
    public void setX(int m){
        x=m;
    }
    public int  getX(){
        return x;
    }
}
class afsar extends kausar{
    int Y;
    public void setY(int n){
        Y=n;
    }
    public int  getY(){
        return Y;
    }

}


public class CWH_lect_45_derived_class {
    public static void main(String[] args) {
    //   kausar k=new kausar();
    //   k.setX(5);
    //   System.out.println(k.getX());
    afsar a=new afsar();
    a.setX(2);
    System.out.println(a.getX());
    a.setY(99);
    System.out.println(a.getY());
      
    }
}
