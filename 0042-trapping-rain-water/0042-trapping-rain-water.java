class Solution {
    public int trap(int[] height) {
       int leftmax = height[0];
       Stack<Integer> rightmax = new Stack<>();
       rightmax.push(height[height.length-1]);
       for(int i=height.length-2;i>=2;i--){
        rightmax.push(Math.max(height[i],rightmax.peek()));
       } 
       int totwater = 0;
       for(int i=1;i<height.length-1;i++){
        int min = Math.min(rightmax.peek(),leftmax);
        int unit = min-height[i];
        totwater += Math.max(unit,0);
        rightmax.pop();
        leftmax = Math.max(leftmax,height[i]);
       }
       return totwater;
    }
}