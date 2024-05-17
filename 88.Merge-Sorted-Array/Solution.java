class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = 0, j = 0, k= 0;
       int[] mergedArray= new int[m+n];
       while(i<m && j<n) {
        if(nums1[i]<=nums2[j]) {
            mergedArray[k] = nums1[i];
            i++;
        }
        else {
            mergedArray[k] = nums2[j];
            j++;
        }
        k++;
       }
       while(i<m) {
        mergedArray[k] = nums1[i];
        i++;
        k++;
       }
       while(j<n) {
        mergedArray[k] = nums2[j];
        j++;
        k++;
       }
       for(int index=0;index<m+n;index++) {
        nums1[index] = mergedArray[index];
       }
    }
}