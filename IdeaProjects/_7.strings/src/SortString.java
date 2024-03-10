<<<<<<< HEAD
public class SortString {
    //https://leetcode.com/problems/sorting-the-sentence/description/
    public static void main(String[] args) {

    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] newarr = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        for (String word : arr) {
            char lastchar = word.charAt(word.length() - 1);
            if (Character.isDigit(lastchar)) {//checking if last char is digit or not
                int index = Character.getNumericValue(lastchar) - 1;//converting it to int value
                if (index >= 0 && index < newarr.length) {//avoiding index out of bound error
                    newarr[index] = word.substring(0, word.length() - 1);
                }
            }
        }
        for (String word : newarr) {
            if (word != null) {
                sb.append(word);
                sb.append(" ");
            }
        }
        return sb.toString().trim();//removing white spaces
    }
=======
public class SortString {
    //https://leetcode.com/problems/sorting-the-sentence/description/
    public static void main(String[] args) {

    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] newarr = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        for (String word : arr) {
            char lastchar = word.charAt(word.length() - 1);
            if (Character.isDigit(lastchar)) {//checking if last char is digit or not
                int index = Character.getNumericValue(lastchar) - 1;//converting it to int value
                if (index >= 0 && index < newarr.length) {//avoiding index out of bound error
                    newarr[index] = word.substring(0, word.length() - 1);
                }
            }
        }
        for (String word : newarr) {
            if (word != null) {
                sb.append(word);
                sb.append(" ");
            }
        }
        return sb.toString().trim();//removing white spaces
    }
>>>>>>> a386e30d6441c1ee03b17c4d46c7bdaaf50a4c6e
}