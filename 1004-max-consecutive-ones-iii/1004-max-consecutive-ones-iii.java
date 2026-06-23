class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int left =0;
        int cv = 0;
        for(int right =0;right<nums.length;right++){
            if(nums[right]==0){
                cv++;
            }
            while(cv>k){
                if(nums[left]==0){
                    cv--;
                }        
               left++;
                    
            }
                
                res = Math.max(res,right-left+1);
            
        }
        return res;
    }
}