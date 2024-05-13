class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, k = 1;
        for(int j=1;j<nums.length;j++) {
            if(nums[j]==nums[i]) {
                continue;
            }
            else {
                nums[++i] = nums[j];
                k++;
            }
        }
        return k;
    }
}
