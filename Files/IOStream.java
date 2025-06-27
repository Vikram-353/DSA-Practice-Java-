package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

//convertinf byte code into character code

public class IOStream {
    public static void main(String[] args) {
        // try (InputStreamReader isr = new InputStreamReader(System.in)) {
        // System.out.print("Enter stream of character: ");
        // int letters = isr.read();
        // while (isr.ready()) {
        // System.out.println((char) letters);
        // letters = isr.read();

        // }

        // isr.close();
        // System.out.println();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // }

        // try (FileReader fr = new FileReader("notes.txt")) {
        // int letters = fr.read();
        // while (fr.ready()) {
        // System.out.print((char) letters);
        // letters = fr.read();

        // }

        // fr.close();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"));) {

            while (br.ready()) {
                System.out.println(br.readLine());

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }

}
