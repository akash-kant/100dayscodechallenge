

// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        int i;
        int temp[] = new int[n + 1];
        for (i = 0; i <= n; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < n - 1; i++) {
            temp[array[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= n - 1; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        return ans;
    }
}
