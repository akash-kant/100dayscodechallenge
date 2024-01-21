

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int n= arr.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<k;i++){
            queue.add(arr[i]);
        }

        for (int i=k;i<n;i++){
            if (queue.peek()>arr[i]){
               
              
                  queue.add(arr[i]);
                    queue.poll();
               
            }
        }

        return queue.peek();
    } 
}
