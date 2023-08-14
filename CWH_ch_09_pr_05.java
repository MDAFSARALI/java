class sphere{
    private int radaius;
    public void rad_getter(int r){
        radaius=r;
    }
    public int rad_setter(){
        return radaius;
    }
}







public class CWH_ch_09_pr_05 {
    public static void main(String[] args) {
        sphere sphere1=new sphere();
        sphere1.rad_getter(10);
        int new_radius=sphere1.rad_setter();
        System.out.println("The new radius or setted/Initialize radius os the sphere is "+new_radius);
        

    }
}
