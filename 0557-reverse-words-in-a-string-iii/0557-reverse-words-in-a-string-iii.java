class Solution {
    public String reverseWords(String s) {
        String res = "";
        s = s.trim();
        int i=-1;
        int j=0;
        for( j=0;j<s.length();j++){
           if(s.charAt(j)==' '){
            res+=rev(s.substring(i+1,j))+" ";
            i = j;
           }
        }
        res+=rev(s.substring(i+1,j));
        return res;

    }
    public static  String rev(String s){
        char arr[] = s.toCharArray();
        int i =0;
        int j = arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}