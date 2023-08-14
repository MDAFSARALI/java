public class CWH_ch_06_pr_06 {
    public static void main(String[] args) {
        int []arr={1,-2,3,2,5,6};
        int max=Integer.MIN_VALUE;
       for (int elements : arr) {
            if (elements>max) {
                max=elements;
            }
       }
       System.out.println("The maximum of teh elemnt in array is "+max);
    }
}
