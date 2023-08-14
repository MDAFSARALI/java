public class CWH_ch_02_pr_02 {
    public static void main(String[] args) {
    char grade='A';
    // Here we have encrypted the grade-----
    grade+=8;
    System.out.println("After encripting the grade: "+ grade);
    // Here we have decrypted the grade-----to original one....
    grade-=8;
    System.out.println("After decrypting the grade: "+grade);
    }
}
