class Solution {
    public int[] shortestToChar(String s, char c) {
        int freq[] = new int[s.length()];
        Arrays.fill(freq,Integer.MAX_VALUE);
        int i=0;
        for(int j=0;j<s.length();j++){
           if(s.charAt(j)==c){
            while(i<=j){
               freq[i] = Math.min(freq[i],j-i);
               i++;
            }
           }
        }
        int k = s.length()-1;
        for(int j=s.length()-1;j>=0;j--){
            if(s.charAt(j)==c){
                while(k>=j){
                    freq[k] = Math.min(freq[k],k-j);
                    k--;
                }
            }
        }
        return freq;
    }
}