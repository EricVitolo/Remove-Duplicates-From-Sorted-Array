class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        int previous = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (pointer < i) {
                nums[pointer] = nums[i];
            }
            
            if (nums[pointer] != previous) {
                previous = nums[pointer];
                pointer++;
            }
        }
        
        return pointer;
    }
}
