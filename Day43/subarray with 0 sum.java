

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        Hashtable<Integer,Integer> hm=new Hashtable<Integer,Integer>();
        int curr_sum=0;
        for(int i=0;i<n;i++)
        {
            curr_sum+=arr[i];
            if(curr_sum==0)
            {
                return true;
            }
            else if(hm.get(curr_sum)!=null)
            {
                return true;
            }
            hm.put(curr_sum,i);
        }
        return false;
    }
}
