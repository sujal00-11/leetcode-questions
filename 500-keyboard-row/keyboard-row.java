import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            
            String lowerWord = word.toLowerCase();
            int targetRow = getRow(lowerWord.charAt(0), row1, row2, row3);
            
            boolean isValid = true;
            for (int i = 1; i < lowerWord.length(); i++) {
                if (getRow(lowerWord.charAt(i), row1, row2, row3) != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
    
    
    private int getRow(char c, String r1, String r2, String r3) {
        if (r1.indexOf(c) != -1) return 1;
        if (r2.indexOf(c) != -1) return 2;
        return 3;
    }
}