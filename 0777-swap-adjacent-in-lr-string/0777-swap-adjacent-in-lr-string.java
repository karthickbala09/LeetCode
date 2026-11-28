class Solution {
    public boolean canTransform(String start, String result) {
        if (!start.replace("X", "").equals(result.replace("X", ""))) {
            return false;
        }

       
        int j = 0; 
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'X') continue; // 'X'-ah skip pannu

           
            while (result.charAt(j) == 'X') {
                j++;
            }

            if (start.charAt(i) == 'R' && i > j) return false;
            
            if (start.charAt(i) == 'L' && i < j) return false;

            j++; 
        }

        return true;
    }
}