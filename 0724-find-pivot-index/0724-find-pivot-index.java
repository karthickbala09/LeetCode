class Solution {
    public int pivotIndex(int[] nums) {
        int prefixsum[] = new int[nums.length];
        prefixsum[0] = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
           prefixsum[i] = nums[i]+prefixsum[i-1];
           sum+=nums[i];
        }
        int lv = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
              lv =0;
              if((sum-(lv+nums[i]))==lv) return i;
            }
            else if(prefixsum[i-1] == (sum-prefixsum[i])) return i;

        }
        return -1;

        
    }
}