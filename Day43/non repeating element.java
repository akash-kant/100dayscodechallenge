

//User function Template for Java

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
         Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        // Traverse array again and return
        // first element with count 1.
        for (int i = 0; i < n; i++)
            if (m.get(arr[i]) == 1)
                return arr[i];
       // return -1;
    
    return 0;
    }  
    
}
