public class CWH_ch_07_pr_08 {
    static void pattern_rect(int row) {
        if (row > 0) {
            pattern_rect(row - 1);
            for (int i = 1; i <= row; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
pattern_rect(5);
    }
}
