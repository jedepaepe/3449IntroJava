// java eu.epfc.cours3449.l18.p1Files.TestFiles
package eu.epfc.cours3449.l18.p1Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFiles {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "text.txt";
        PrintWriter fout = new PrintWriter(fileName);
        fout.println("File Hello World");
        fout.flush();

        Scanner fin = new Scanner(new File(fileName));
        while (fin.hasNext()) {
            String line = fin.nextLine();
            System.out.println(line);
        }
    }

}
