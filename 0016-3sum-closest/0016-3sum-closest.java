class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-sum);
                if(diff < res){
                   res = diff;
                   ans = sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else return sum;
               
            }
        }
        return ans;
    }
}