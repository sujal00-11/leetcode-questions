class Solution {
    public boolean isPalindrome(String s) {
        if(s.isBlank()){
            return true;
        }
        s = s.toLowerCase();
        int l = s.length();
        String rev ="";
        for(int i = l-1;i>=0;i--){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                rev = rev + ch;
            }
        }
        String original = "";
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                original = original + ch;
            }
        }
        if(original.equals(rev)){
            return true;
        }
        return false;
    }
}