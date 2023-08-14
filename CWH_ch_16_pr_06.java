import java.io.FileWriter;

public class CWH_ch_16_pr_06 {
    public static void main(String[] args) {

        String table = "";
    for (int i = 2; i < 10; i++) {
        
        for (int j = 1; j < 11; j++) {
            table += i + "X" + j + "=" + (i * j);
            table += "\n";
        }
        System.out.println();
    }
        
        try {
            FileWriter fileWriter = new FileWriter("mult.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error ...");
        }
    }
}
