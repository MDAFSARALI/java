public class CWH_ch_07_pr_6 {
    static float avg( int... arr) {
        float result = 0;
        for (float a : arr) {
            result += a;
        }
        result=result/arr.length;
        return result;
    }

   

    public static void main(String[] args){
        System.out.println("The average of the number is : ");
        System.out.println( (avg(10,10,23)));
    } 
        
}    

