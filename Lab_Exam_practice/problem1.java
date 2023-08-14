import java.io.*;
public class problem1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(in);
        // int input=Integer.parseInt(br.readLine());
         int input = Integer.parseInt(args[0]);
        for (int i = 1; i <= input; i++) {
            int flag=1;
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    flag=0;
                    break;
                }
                   
            }
            if(flag==1){
                System.out.println(i);
            }
        }
        
    }
}
