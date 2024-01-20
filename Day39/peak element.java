

/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n == 1){
           return 0;
       }
       
       for(int i = 0; i<n ; i++){
           if ((i == n - 1 || arr[i] >= arr[i + 1]) && (i == 0 || arr[i - 1] <= arr[i])) {
            return i;
        }
       }
       return -1;
    }
}
