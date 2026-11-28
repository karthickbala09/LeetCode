class Solution {
    public int minimumLength(String s) {
        int j=s.length()-1;
        int i=0;
        int ans = s.length();
        while(i<j){
            char prefix=s.charAt(i);
              char suffix=s.charAt(j);
             if(prefix!=suffix){
            return j-i+1;
           }
            while( i<j && s.charAt(i)==s.charAt(i+1)){
                // prefix=prefix+s.charAt(i);
                i++;
            }
          
            while( i<j && s.charAt(j)==s.charAt(j-1)){
                // suffix = suffix+s.charAt(j);
                j--;
            }
           
    
                    i++;
                    j--;
                    ans =Math.max(0, j-i+1);
            
          

        }
        return ans;  
    }
}