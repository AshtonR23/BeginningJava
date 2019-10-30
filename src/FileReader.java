import java.util.*;
import java.io.*;
public class FileReader {

    public static void main (String[]args)
            throws FileNotFoundException {
        File fileinput = new File("/Users/ashtonrischer/IdeaProjects/Beginning Java/src/TestFile");
        Scanner input = new Scanner(fileinput);
        int count = 0;
        int doubles = 0;
        int words = 0;

        while (input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);

            while (line.hasNext()) {
                if (line.hasNextInt()) {
                    int word = line.nextInt();
                    count++;
                } else if (line.hasNextDouble()) {
                    double word = line.nextDouble();
                    doubles++;
                } else if (line.hasNext()) {
                    String word = line.next();
                    words++;
                }

            }
        }
        System.out.println("There are " + count + " integers");
        System.out.println("There are " + doubles + " doubles in this file");
        System.out.println("There are " + words + " words in this file");
    }
}