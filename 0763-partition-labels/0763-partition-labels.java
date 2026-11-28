class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        int var=0;
        for(int i=0;i<s.length();i++){
            int index = s.lastIndexOf(s.charAt(i));
             var= Math.max(var,index);
            if(i==var){
               // System.out.println(i-j+1);
                list.add(i-j+1);
                j=i+1;
            }
        }
        return list;
    }
}