import java.util.Scanner;

public class Tracksheet105 {
    public static void main(String[] args) {
        //Count vowels and consonants in a string
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int vowelcount = 0;
        int consocount = 0;

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                boolean vowel = false;
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U': {
                        vowelcount++;
                        vowel = true;
                    }

                }
                if (vowel == false) {
                    consocount++;
                }
            }
        }
        System.out.println(vowelcount);
        System.out.println(consocount);

    }
}
