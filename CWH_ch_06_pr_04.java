public class CWH_ch_06_pr_04 {
    public static void main(String[] args) {
        /*
         * int [][]array1=new int [2][3];
         * array1[0][0]=1;
         * array1[0][1]=2;
         * array1[0][2]=3;
         * array1[1][0]=4;
         * array1[1][1]=5;
         * array1[1][2]=6;
         * 
         * System.out.println("Matrix: 01");
         * System.out.printf("%d\t%d\t%d\n",array1[0][0],array1[0][1],array1[0][2]);
         * System.out.printf("%d\t%d\t%d\n",array1[1][0],array1[1][1],array1[1][2]);
         * System.out.println();
         * int [][]array2=new int [2][3];
         * array2[0][0]=7;
         * array2[0][1]=8;
         * array2[0][2]=9;
         * array2[1][0]=10;
         * array2[1][1]=11;
         * array2[1][2]=12;
         * System.out.println("Matrix: 02");
         * System.out.println();
         * System.out.printf("%d\t%d\t%d\n",array2[0][0],array2[0][1],array2[0][2]);
         * System.out.printf("%d\t%d\t%d\n",array2[1][0],array2[1][1],array2[1][2]);
         * System.out.println("The martrix after addition:\n");
         * System.out.printf("%d\t%d\t%d\n",array1[0][0]+array2[0][0],array1[0][1]+
         * array2[0][1],array1[0][2]+array2[0][2]);
         * System.out.printf("%d\t%d\t%d\n",array1[1][0]+array2[1][0],array1[1][1]+
         * array2[1][1],array1[1][2]+array2[1][2]);
         */

        // ----------------By harry:// Printing the elements of the 2-D array...
        int[][] mat1 = { { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] mat2 = { { 2, 6, 13 },
                { 3, 7, 1 }
        };
        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 }
        };
        for (int i = 0; i < mat1.length; i++)// Row numbers of times....
            for (int j = 0; j < mat2[i].length; j++) {// Coloumn number of times....
                System.out.format("Setting the value of i=%d and j=%d :\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }// Niche wala for loop printing ke liye use ho raha hai ...
            for (int i = 0; i < mat1.length; i++){// Row numbers of times....
            for (int j = 0; j < mat2[i].length; j++) {// Coloumn number of times....
                    System.out.print(result[i][j]+"   ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println();
        }

    }
}
