class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase().trim();
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
              sb.append(s.charAt(i));
        }
      }
      String res = sb.toString();
      String res1 = sb.reverse().toString();
      System.out.println(res);
      return (res.equals(res1))?true:false;
    }
}