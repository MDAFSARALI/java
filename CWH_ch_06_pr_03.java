public class CWH_ch_06_pr_03 {
    public static void main(String[] args) {
        
        float [] marks_in_physics = { 100.1f, 90.1f, 80.1f, 70.1f, 60.1f };     
        float sum = 0;
        for (float i : marks_in_physics) {
            System.out.println(i);
             sum=sum+i;
        }
         float average=sum/marks_in_physics.length;
         System.out.printf("Total sum: %f and average is %f ",sum,average );
    }
}
