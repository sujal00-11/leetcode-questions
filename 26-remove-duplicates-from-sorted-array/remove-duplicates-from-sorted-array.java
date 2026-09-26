class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int count = 0;
        for(int num : nums){
            if(num != prev){
                nums[count] = num;
                count++;
                prev = num;
            }
        }
        return count;
    }
}