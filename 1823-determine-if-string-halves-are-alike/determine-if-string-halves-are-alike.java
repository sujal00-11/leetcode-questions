class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int vowelsCount = 0;
        int left = 0, right = n / 2;
        
        
        String vowels = "aeiouAEIOU";
        
        while (left < n / 2) {
            
            if (vowels.indexOf(s.charAt(left)) != -1) {
                vowelsCount++;
            }
            
            if (vowels.indexOf(s.charAt(right)) != -1) {
                vowelsCount--;
            }
            left++;
            right++;
        }
        
        return vowelsCount == 0;
    }
}