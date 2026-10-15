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
        if (text.equals("")) {
            return "";
        }

        String word = "";
        int current = 0;

        while (current < text.length()) {

            String currentChar = text.charAt(current) + "";

            if (current == 0) {
                word += currentChar.toUpperCase();
            } else if (text.charAt(current - 1) == ' ') {
                word += currentChar.toUpperCase();
            } else {
                word += currentChar;
            }

            current++;
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
        if (text == null) {
            return false;
        }
        if (text == "") {
            return true;
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

    public String everyNthChar(int n) {
        int length = text.length();
        int current = 0;
        String result = "";

        while (current < length) {
            result += text.charAt(current);
            current += n;
        }

        return result;
    }

    public boolean isPalindromeIgnoringSpaces() {
        String pal = text.toLowerCase();

        String result = "";
        int last = pal.length() - 1;

        while (last >= 0) {
            if (pal.charAt(last) != ' ') {
                result += pal.charAt(last);
            }
            last--;
        }

        String result2 = "";
        int start = 0;

        while (start < pal.length()) {
            if (pal.charAt(start) != ' ') {
                result2 += pal.charAt(start);
            }
            start++;
        }

        return result.equals(result2);
    }

}
