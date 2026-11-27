class Solution {
    public int compareVersion(String version1, String version2) {
     String x[] = version1.split("\\.");
     String y[] = version2.split("\\.");
     int i=0;
     int j=0;
     while(i<x.length || j<y.length){
     
     int v1 = (i < x.length) ? Integer.parseInt(x[i]) : 0;
            int v2 = (j < y.length) ? Integer.parseInt(y[j]) : 0;

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
            i++;
            j++;
     }
     return 0;
    }
}