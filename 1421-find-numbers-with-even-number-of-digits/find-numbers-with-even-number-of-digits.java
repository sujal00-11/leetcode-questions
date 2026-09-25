class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int d = 0;
            while(num != 0){
                num = num/10;
                d++;
            }
            if(d % 2 == 0){
                count+=1;
            }
        }
        return count;
    }
}