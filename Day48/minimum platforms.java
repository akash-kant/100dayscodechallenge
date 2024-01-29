
//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(dep);
        Arrays.sort(arr);
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        pq.add(dep[0]);
        for(int i=1;i<n;i++){
            if(arr[i]> pq.peek()){
                pq.poll();
                pq.add(dep[i]);
            }else{
                pq.add(dep[i]);
            }
        }
        return pq.size();
        
    }
    
}
