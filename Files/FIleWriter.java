package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FIleWriter {
    public static void main(String[] args) {
        try {
            File fo = new File("new-File.txt");
            fo.createNewFile();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        // write in file

        try {
            FileWriter fw = new FileWriter("new-File.txt");
            fw.write("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन");
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("new-File.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
