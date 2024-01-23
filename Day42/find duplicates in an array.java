

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
         Arrays.sort(arr);
        ArrayList<Integer>arr1 = new ArrayList<Integer>();
        int count[] = new int[n];
        int i;
 
        
        for (i = 0; i < n; i++) {
            if (count[arr[i]] == 1)
            {
                    arr1.add(arr[i]);
                    count[arr[i]]++;
                
            }
                
            else
                count[arr[i]]++;
        }
        if(arr1.size()==0){
            arr1.add(-1);
        }
        
        return arr1;
    }
}
