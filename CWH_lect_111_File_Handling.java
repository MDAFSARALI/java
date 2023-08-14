import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

public class CWH_lect_111_File_Handling {
    public static void main(String[] args) {
        // Code to create a new file;
        // File myFile=new File("CWH111file.txt");
        // try {
        //     myFile.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("Unable to Create this file...");
        //     e.getStackTrace();
        // }
        // Code to Write to a file...
        // try {
        //     FileWriter fileWriter=new FileWriter("CWH111file.txt");
        //     fileWriter.write("This is our file from this java course...\n Again going to write something...");
        //     fileWriter.close();
        // } catch (IOException e) {
        //     System.out.println("Unable to write int the file...");
        //     e.printStackTrace();
        // }

        // Reading from the file
        // File myFile=new File("CWH111file.txt");
        // try {
        //     Scanner sc=new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         String line=sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // Deleteing a file: 
            File myFile=new File("CWH111file.taxt");
            if (myFile.delete()) {
                System.out.println("I have deleted..."+myFile.getName());  
            }
            else{
                System.out.println("Some problem occured during deleting the file...");
            }

    }
}
