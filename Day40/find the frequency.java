//User function Template for Java

class Solution{
    int findFrequency(int arr[], int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
}
