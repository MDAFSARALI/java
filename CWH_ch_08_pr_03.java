class square {
// public int initializing(int length){
//     return length;
// }
// public int cal_area(int length){
//     return length*length;
// }
// public int perimetere(int length){
//     return 4*length;
// }
    //By harry.....>
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}



public class CWH_ch_08_pr_03 {
    public static void main(String[] args) {
        square square=new square();
        // int length=10;
        // int a=square.initializing(length);
        // int b=square.cal_area(length);
        // int c=square.perimetere(length);
        // System.out.println("The length of side of square: "+a);
        // System.out.println("The area of the square is:"+b);
        // System.out.println("The perimeter of the square :"+c);

        // By harry.....>
        square.side=3;
        System.out.println(square.area());
        System.out.println(square.perimeter());
        
       

        
    }
}
