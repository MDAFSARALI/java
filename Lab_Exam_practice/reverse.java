import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse {

    public static void main(String[] args) {
        String input=null;
        InputStreamReader in=new InputStreamReader( System.in);
        BufferedReader br=new BufferedReader(in);
        try {
             input = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int length=input.length();
        
    }
}
