public class pattern_hollow_rhymbous {
    public static void main(String[] args) {
        int rows =4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < rows - i + 1; j++) {
                System.out.print(" ");
            }

            if (i == 1 || i == rows) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*");
                }

            } else {
                System.out.print("*");
                for (int k = 1; k < rows -1; k++) {

                    System.out.print(" ");

                }

            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
