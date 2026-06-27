class Solution {
    public int largestAltitude(int[] gain) {
        int prefixsum[] = new int[gain.length+1];
        prefixsum[0] = gain[0];
        int res = prefixsum[0];
        for(int i=1;i<gain.length;i++){
            prefixsum[i] = prefixsum[i-1]+gain[i];
            res = Math.max(res,prefixsum[i]);
        }
        System.out.println(Arrays.toString(prefixsum));
        return Math.max(res,prefixsum[gain.length]);

    }
}