
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
     
        int leftsum=0,rightsum=0,pos=-1;
        for(int i=0;i<n;i++)
            rightsum+=arr[i];
        for(int i=0;i<n;i++){
            rightsum-=arr[i];
            if(leftsum==rightsum){
                pos=i+1;
                break;
            }
            leftsum+=arr[i];
        }   
        return pos;
    }
    
}
