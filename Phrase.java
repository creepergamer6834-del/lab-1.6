public class Phrase {

    private String text;

    public Phrase(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }

    // Read REQ 03
    public String reversed() {
        int first = 0;
        String result = "";
        int last = text.length() - 1;
        if (text == "" || text == null) {
            return "";
        }
        while (last >= first) {
            result += text.charAt(last);
            last -= 1;
        }
        return result;
    }

    // Read REQ 04
    public int countChar(char target) {
        int length = text.length();
        int currentChar = length - 1;
        int counter = 0;
        while (currentChar >= 0) {
            if (text.charAt(currentChar) == target) {
                counter += 1;
            }
            currentChar -= 1;
        }
        return counter;
    }

    // Read REQ 05
    public boolean isAllDigits() {
        int length = text.length();
        int currentChar = length - 1;
        boolean isNumber = true;
        if (text == "" || text == null) {
            return false;
        }
        while (isNumber) {
            int numAtChar = (int) (text.charAt(currentChar));
            if ((numAtChar < 48) || (numAtChar > 57)) {
                return false;
            } else {
                currentChar -= 1;
            }
            if (currentChar < 0) {
                isNumber = false;
            }
        }
        return true;
    }

    // Read REQ 06
    public int countAdjacentPairs() {
        int length = text.length();
        int num = length - 1;
        int pairs = 0;
        if (text == "" || text == null) {
            return pairs;
        }
        while (num > 0) {
            char character1 = (text.charAt(num));
            char character2 = (text.charAt(num - 1));
            if (character1 == character2) {
                pairs += 1;
            }
            num -= 1;
        }
        return pairs;
    }

    // Read REQ 07
    public int countOccurrences(String target) {
        int length = text.length();
        int num = length - 1;
        int occurances = 0;
        if (text == "" || text == null || target.length() > text.length()) {
            return occurances;
        }
        if (text.equals(target)) {
            return 1;
        }
        while (num > 0) {
            char character1 = (text.charAt(num));
            char character2 = (text.charAt(num - 1));
            String together = character1 + "" + character2;
            if (target.equals(together)) {
                occurances += 1;
            }
            num -= 1;
        }
        return occurances;
    }

    // Read REQ 08
    public String capitalizeWords() {
        int length = text.length();
        int current = 0;
        String word = "";
        if (text == "" || text == null) {
            return "";
        }
        if (text.length() == 1) {
            return text.toUpperCase();
        }
        while (current < length) {
            String currentChar = text.charAt(current) + "";
            int charVal = (int) text.charAt(current);
            if (current == 0) {
                word += currentChar.toUpperCase();
            } else {
                word += currentChar;
            }
            if (charVal == 32 && current + 1 <= length - 1) {
                String nextChar = text.charAt(current + 1) + "";
                nextChar = nextChar.toUpperCase();
                word += nextChar;
                current += 1;
            }
            current += 1;
        }
        return word;
    }

    // Read REQ 09
    public boolean isPalindrome() {
        int first = 0;
        boolean palindrome = false;
        String result = "";
        String pal = text.toLowerCase();
        int last = text.length() - 1;
        if (text == "" || text == null) {
            return false;
        }
        while (last >= first) {
            result += pal.charAt(last);
            last -= 1;

        }
        if (result.equals(pal)) {
            palindrome = true;
        }
        return palindrome;
    }

    public String everyNthChar( int n){
        int length = text.length();
        int current = 0;
        String result = text.charAt(current) + "";
        while (current <= length){
            current += n;
            result += text.charAt(current);
        }
        return result;
    }

    public boolean isPalindromeIgnoringSpaces(){
        int first = 0;
        boolean palindrome = false;
        String result = "";
        String pal = text.toLowerCase();
        int last = text.length() - 1;
        if (text == "" || text == null) {
            return false;
        }
        while (last >= first) {

            if ((int)(text.charAt(last)) == 32){
                last -= 1;
            }else{
                result += pal.charAt(last);
                last -= 1;
            }
        }
        String result2 = "";
        int start = 0;
        int end = text.length();
        while (start <= end){
            if ((int)(text.charAt(start)) == 32){
                start -= 1;
            }else{
                result2 += pal.charAt(start);
                start -= 1;
            }
        }
        if (result.equals(result2)) {
            palindrome = true;
        }
        return palindrome;
    }

}
