class Solution {
    public int findDuplicate(int[] nums) {
     Arrays.sort(nums);
     int j=0;
     for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[j]) return nums[i];
        j++;
     }
     return 0;
    }
}