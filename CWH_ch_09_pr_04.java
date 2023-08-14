class rectangle{
    int length;
    int breadth;
    public rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public int length(){
        return length;
    }
    public int breadth(){
        return breadth;
    }
}





public class CWH_ch_09_pr_04 {
    public static void main(String[] args) {
        rectangle rectangle1=new rectangle(4, 5);
         int new_length=rectangle1.length();
         System.out.println("The length of the rectangle is "+new_length);
         int new_breadth=rectangle1.breadth();
         System.out.println("The breadth of the rectangle is "+new_breadth);
    }
}
