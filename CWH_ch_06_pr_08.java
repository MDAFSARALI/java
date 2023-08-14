public class CWH_ch_06_pr_08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 41, 5, 6 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted...");
        } else {
            System.out.println("The array is not sorted...");
        }
    }
}
