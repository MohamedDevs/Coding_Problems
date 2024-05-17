class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(target>nums[end])
            return end + 1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(target==nums[mid])
                return mid;
            else if(target<nums[mid])
                end = mid - 1;
            else 
                start = mid + 1;
        }
        if(nums[start]>target)
            return start;
        else
            return start - 1;
    }
}