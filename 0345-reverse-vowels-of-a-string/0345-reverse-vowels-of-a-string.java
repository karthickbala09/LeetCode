class Solution {
    public String reverseVowels(String s) {
    int i = 0;
    int j = s.length()-1;
    char arr[] = s.toCharArray();
    while(i<j){
        char a = arr[i];
        char b = arr[j];
        if("AEIOUaeiou".indexOf(a)!=-1 && "AEIOUaeiou".indexOf(b)!=-1)
        {
           char temp = a;
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
        else if("AEIOUaeiou".indexOf(a)==-1){
             i++;
        }
        else if("AEIOUaeiou".indexOf(b)==-1){
            j--;
        }
      
    }
    return new String(arr);
        
    }
}