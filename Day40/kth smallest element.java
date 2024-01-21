

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> max_pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=l;i<k;i++)
        {
            max_pq.add(arr[i]);
        }
        for(int j=k;j<=r;j++)
        {
            if(arr[j]<max_pq.peek())
            {
                max_pq.poll();
                max_pq.add(arr[j]);
            }
        }
        return max_pq.peek();
    } 
}
