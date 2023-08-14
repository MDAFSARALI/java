import java.util.Scanner;
public class afsu {
    public static void main(String[] args) {
        System.out.println("Please enter the no of rows: ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=rows-i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}


