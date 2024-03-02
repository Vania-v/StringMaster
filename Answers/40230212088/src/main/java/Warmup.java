public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] words = sentence.split("\\s+");
        if (number >= 1 && number <= words.length) {
            return words[number-1];     
        } else {
            return "Number = " + number + " is out Of Bound";
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public static int oddEvenCounter(String number, boolean searchForEven){
        int count = 0;
        if (searchForEven) {
            String numberString = String.valueOf(number);
            for (int i = 0; i < numberString.length(); i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                if (digit % 2 == 0) {
                    count++;
                }
            }
            return count;
        } else {
            String numberString = String.valueOf(number);
            for (int i = 0; i < numberString.length(); i++) {
                int digit = Character.getNumericValue(numberString.charAt(i));
                if (digit % 2 == 1) {
                    count++;
                }
            }
            return count;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        String wordALower = wordA.toLowerCase();
        String wordBLower = wordB.toLowerCase();

        if (wordALower.compareTo(wordBLower) < 0) {
            return wordA;
        } else if (wordBLower.compareTo(wordALower) < 0) {
            return wordB;
        } else {
            return "Both words are equal.";
        }
    }
}
