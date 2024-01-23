

// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] a, int n) {
        HashMap<Integer,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
           if(h.containsKey(a[i]))
           {
               int f = h.get(a[i]);
               f++;
               h.put(a[i],f);
           }
           else
           h.put(a[i],1);
        }
        
        for(int i=0;i<n;i++){
            if(h.get(a[i])>1)
            return i+1;
        }
        return -1;
    }
}
