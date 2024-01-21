

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> al=new ArrayList<>();
        boolean found=false;
        int st=0;
        int end=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>=s){
                end=i;
                while(sum>s&&st<end){
                    sum=sum-arr[st];
                    st++;
                }
            }if(sum==s){
                al.add(st+1);
                al.add(end+1);
                found=true;
                break;
            }
        }if(!found){
            al.add(-1);
        }return al;
        
    }
}
