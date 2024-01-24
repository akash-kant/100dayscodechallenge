

//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int res=0,sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                sum+=-1;
            else
                sum+=1;
            if(hm.containsKey(sum)){
                res=res+hm.get(sum);
                hm.put(sum,hm.get(sum)+1);
            }
            else
                hm.put(sum,1);
        }
        return res;
    }
}
