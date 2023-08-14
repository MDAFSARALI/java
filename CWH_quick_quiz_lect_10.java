// What will be the value of the following expression (x);
public class CWH_quick_quiz_lect_10 {
    public static void main(String[] args) {
        int y=7;
        int a=y++*8;//(This line will print 56 because first use of y then increment )
        System.out.println(a);
        int b=++y*8;
        System.out.println(b);//(This line will print 64 because first increment of y then use )
    }
}
