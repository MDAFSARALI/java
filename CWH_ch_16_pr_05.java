import java.io.FileWriter;

public class CWH_ch_16_pr_05 {
    public static void main(String[] args) {
        int i=5;
        System.out.println("Multiplication table of 5 is : ");
        String table="";
        for (int j = 1; j <11; j++) {
            table +=i+"X"+j+"="+(i*j);
            table +="\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error ...");
        }
    }
}
