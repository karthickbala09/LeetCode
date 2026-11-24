class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq1[Math.abs('a'-s.charAt(i))]++;
        }
        for(int i=0;i<t.length();i++){
            freq2[Math.abs('a'-t.charAt(i))]++;
        }
        return (Arrays.equals(freq1,freq2));
    }
}