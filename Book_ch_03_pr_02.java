public class Book_ch_03_pr_02 {
    int a;
    int b;
    String name1;
    Book_ch_03_pr_02(){
        a=10;
        b=100;
    }
    void Book_ch_02_pr_03(String name){
        this.name1=name;
        System.out.println("My name is :"+name);
    }
      
    public static void main(String[] args) {
        Book_ch_03_pr_02 b=new Book_ch_03_pr_02();
        System.out.println(b.a);
        System.out.println(b.b);
        b.Book_ch_02_pr_03("Afzal ali");
        
    }
}

