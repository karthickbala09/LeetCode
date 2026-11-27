class Solution {
    public int numRescueBoats(int[] people, int target) {
        int i = 0;
        Arrays.sort(people);
        int j = people.length-1;
        int boat = 0;
        while(i<j){
            int w = people[i]+people[j];
            if(w>target){
                boat++;
                j--;
            }
            else if(w<=target){
                boat++;
                j--;
                i++;
            }
        }
        if(i==j) boat++;
        return boat;
    }
}