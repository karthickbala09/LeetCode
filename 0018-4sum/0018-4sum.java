class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>>  list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n;j++){
            int left = j+1;
            int right = n-1;
            while(left<right){
                long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
              
                if(sum>target){
                   right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                    if(set.isEmpty()){
                        set.add(temp);
                    }
                    if(!set.isEmpty() && !set.contains(temp)){ 
                        set.add(temp);
                    }
                    left++;
                    right--;
                }
            }
            }

        }
        System.out.println(set);
        return new ArrayList<>(set);

    }
}