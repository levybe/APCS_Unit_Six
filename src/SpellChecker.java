import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker {
    public static String[] getDictionary() throws IOException {
        String[] dictionary = new String[61336];
        Scanner wordsScan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (wordsScan.hasNext()) {
            dictionary[count] = wordsScan.next();
            count++;
        }

        return dictionary;
    }

    public static boolean wordInDictionary(String word, String[] dictionary) {
        int min = 0;
        int max = dictionary.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (dictionary[mid].equals(word)) {
                return true;
            }
            else if (dictionary[mid].compareTo(word) > 0) {
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void write(String[] arr) throws IOException {
        FileWriter fw = new FileWriter("files/writeto.txt");
        for (String word : arr) {
            fw.write(word + " ");
        }
        fw.close();
    }

    public static void main (String[] args) throws IOException {
        Scanner textScan = new Scanner(new File("files/alice.txt"));
        FileWriter fw = new FileWriter("files/corrected.txt");
    }
}
