class Solution {
    public String firstPalindrome(String[] words) {
        for(String val:words){
            if(isp(val)){
                return val;
            }
        }
        return "";
    }
    public static boolean isp(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}