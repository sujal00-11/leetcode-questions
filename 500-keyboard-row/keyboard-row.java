import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String word : words) {
            int[] temp = new int[3];

            for (char ch : word.toLowerCase().toCharArray()) {
                if (row1.indexOf(ch) != -1) {
                    temp[0]++;
                } else if (row2.indexOf(ch) != -1) {
                    temp[1]++;
                } else if (row3.indexOf(ch) != -1) {
                    temp[2]++;
                }
            }

            if (temp[0] == word.length() ||
                temp[1] == word.length() ||
                temp[2] == word.length()) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}