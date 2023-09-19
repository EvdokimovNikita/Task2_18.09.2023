import java.util.Arrays;

// Задание: Поиск наиболее похожего слова в массиве на данное

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"мама мыла раму шапкой тома"};
        //{"мама мыла раму майкой"};
        String word = "мыка";
        String[] wordArray = word.split("");
        int countLettersFinal = 0;
        int countIndexWordFinal = 0;
        searchWord(stringArray, wordArray, countLettersFinal, countIndexWordFinal);
    }

    public static void searchWord(String[] stringArray, String[] wordArray, int countIndexWordFinal, int countLettersFinal) {
        int countLetters=0;
        int countIndexWord=0;
        String createString = Arrays.toString(stringArray).replaceAll("^\\[|\\]", "");
        String[] newWholeArray = createString.split(" ");
        String[] newWholeArrayI;
        for (int i = 0; i < newWholeArray.length; i++) {
            newWholeArrayI = newWholeArray[i].split("");
            for (int y = 0; y < newWholeArray.length; y++) {
                for (int j = 0; j < wordArray.length; j++) {
                    if (wordArray[j].equals(newWholeArrayI[j])) {
                        countLetters++;
                        countIndexWord = i;
                    }
                    if (countLetters > countLettersFinal) {
                        countLettersFinal = countLetters;
                        countIndexWordFinal = countIndexWord;
                    }
                }
            }
            countLetters = 0;
            countIndexWord = 0;
        }
        System.out.println(newWholeArray[countIndexWordFinal]);

    }
}

