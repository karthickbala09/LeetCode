class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maxheight = 0;
        while(i<j){
            int width = j-i;
            int area = width * Math.min(height[i],height[j]);
            maxheight = Math.max(maxheight,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxheight;
    }
}