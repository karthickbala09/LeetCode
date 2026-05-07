class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start = 0;
       int end = 0;
       int max =0;
       HashSet<Character> set = new HashSet<>();
      while(end<s.length()){
        char ch = s.charAt(end);
        while(set.contains(ch)){
            set.remove(s.charAt(start));
            start+=1;
        }
        set.add(ch);
        max = Math.max(max,(end-start+1));
        end+=1;
      }

        return max;
    }
}