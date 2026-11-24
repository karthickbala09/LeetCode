class Solution {
    public int majorityElement(int[] nums) {
     int c = 0;
     int can = 0;
     for(int n:nums){
        if(c==0) can = n;
        if(can==n) c++;
        else c--;
     }
     return can;

}
}