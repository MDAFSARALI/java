class rectangle{
    int a;
    int b;
    public int vol(int length,int breadth){
        this.a=length;
        this.b=breadth;
        int vol=a*b;
        return vol;
    }
}
class cuboid extends rectangle{
    // int c;
    // public int vol(int length,int breadth,int weidth){
    //     this.a=length;
    //     this.b=breadth;
    //     this.c=weidth;
    //     this.c=weidth;
    //     int vol=a*b*c;
    //     return vol;
    // }
    public void new_mwthod(){
        System.out.println("This is the method of the cuboid...");
    }

}
public class CWH_ch_10_pr_02 {
    public static void main(String[] args) {
        cuboid cbd=new cuboid();
        // System.out.println(cbd.vol(2, 5));  yaha par length and breadth of the rectangle ka use hua hai...
        // System.out.println(cbd.vol(2, 5, 10));
        System.out.println(cbd.vol(5, 2));   
        cbd.new_mwthod();
    }
}
