import java.util.Scanner;

public class Anagram{


    public  String sortWord(String s) { //tworzymy metodę sortującą znaki w słowie - korzystamy tutaj z sortowania bąbelkowego
        char[] characters = s.toCharArray();

        for (int i = 0, changes = 1; i < characters.length - 1 && changes != 0; i++) {
            changes = 0; 
            for (int j = 0; j < characters.length - 1; j++) {
                if (characters[j] > characters[j + 1]) {
                    char pom = characters[j + 1];
                    characters[j + 1] = characters[j];
                    characters[j] = pom;
                    changes++;
                }
            }
        }
        System.out.println(new String(characters));
        return new String(characters);
    }

    public  boolean czyAnagramy(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        return sortWord(x).equals(sortWord(y));
    }
}