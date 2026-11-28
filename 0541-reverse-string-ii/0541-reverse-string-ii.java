class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = 0;
        int j = 2 * k;

        while (i < n) {
            int remLen = n - i;

            if (remLen < k) {
                reverse(arr, i, n - 1);
            } else {
                reverse(arr, i, i + k - 1);
            }

            // Neenga sonna maari i-ah j kitta move panni, j-ah adutha 2k-ku thallurom
            i = j;
            j += 2 * k;
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}