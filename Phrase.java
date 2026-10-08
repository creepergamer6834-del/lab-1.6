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
        return -999;
    }

    // Read REQ 08
    public String capitalizeWords() {
        return "TODO";
    }

    // Read REQ 09
    public boolean isPalindrome() {
        return false;
    }

}
