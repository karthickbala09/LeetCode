class Solution {
    public int[] twoSum(int[] nums, int target) {
          Map<Integer,Integer> obj = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
          int d = target - nums[i];
          
          if(obj.containsKey(d))
          {
            return new int [] {i,obj.get(d)} ;
          }
          obj.put(nums[i],i);
        }
        
        return null  ;
    }
}