public class CWH_lect_34_quick_quiz {
    static int fact(int x){
        if (x==0||x==1) {
            return 1;
        }
        else{
            return x*fact(x-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The factorial of the number n is :"+fact(n));
    }
}
