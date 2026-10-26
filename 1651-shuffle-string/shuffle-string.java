class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            // Place each character from s into its target position specified by indices[i]
            result[indices[i]] = s.charAt(i);
        }
        
        return new String(result);
    }
}