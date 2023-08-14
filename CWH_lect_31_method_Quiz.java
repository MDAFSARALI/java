public class CWH_lect_31_method_Quiz {
    static int sum(int a,int b){//Here we have used the static key word thats why we don't need the object creation........
        int c;
        c=a+b;
        return c;
         
    }
    public static void main(String[] args) {
    int x=100;
    int y=200;
    int z;
    z=sum(x,y);
    System.out.println(z);
    }
    
}

// Static method de static method directly call kar paoge without object creation......