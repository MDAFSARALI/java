public class Book_ch_03_pr_1 {
    int  a;
    int b;
    Book_ch_03_pr_1(int a,int b){
        this.a=a;
        this.b=b;
    
    }
    public int name(){
        return a+b;
    }
    public static void main(String[] args) {
        Book_ch_03_pr_1 b=new Book_ch_03_pr_1(5, 3);
       System.out.println(b.a);
       System.out.println(b.b);
       System.out.println(b.name());
        
    }
}
