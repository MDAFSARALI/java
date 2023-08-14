public class CWH_ch_06_pr_05 {
    public static void main(String[] args) {
        // int []array={100,90,80,70,60,50,40,30,20,10};
        // for (int i = array.length-1; i >= 0; i--) {
        //     System.out.println(array[i]);
        // }

        //  BY CODEWITHHARRY::::::::::::::::::::::
        int []arr={1,2,3,4,5,6};
        int l=arr.length;
        int temp;
        int n=Math.floorDiv(l, 2);
        // System.out.println(a);
        for (int i = 0; i < n; i++) {
            // Logic of swapping ........arr[i] to arr[l-1-i]
             temp=arr[i];
             arr[i]=arr[l-1-i];
             arr[l-1-i]=temp;
        }
        for (int elements : arr) {
            System.out.print(elements+"  ");
        }
    }
}
