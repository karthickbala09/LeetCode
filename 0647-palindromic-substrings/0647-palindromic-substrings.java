class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            int j=i+1;
            while(j<s.length()){
                if(isp(s.substring(i,j+1))){
                    count++;
                }
                j++;
            }
        }
        return count+s.length();

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