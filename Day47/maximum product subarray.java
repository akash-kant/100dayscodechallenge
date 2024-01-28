class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxVal =Integer.MIN_VALUE;
        if(n == 1)
        {
            return arr[0];
        }
        for(int i =0 ;i < n;i++)
        {
            long max = 1;
            for(int j = i; j < n;j++)
            {
                max *= arr[j];
                maxVal = Math.max(max,maxVal);
            }
            
        }
        return maxVal;
    }
}
