
// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int nums[]){
        int index = -1;
        int n = nums.length;
        
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0,n-1);
            List<Integer> li = new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
            return li;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[index] < nums[i]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int i = index + 1;
        int j = n - 1;
        reverse(nums,i,j);
        List<Integer> li = new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        return li;
    }
    public static void reverse(int[] nums,int s, int e)
    {
      while(s<e)
      {
          int temp=nums[s];
          nums[s]=nums[e];
          nums[e]=temp;
          s++;
          e--;
      }
    }
}
