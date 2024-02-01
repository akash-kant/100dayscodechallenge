

//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long, Long> map = new HashMap<>();
        for(int i=0;i<n; i++){
            // System.out.println(a1[i]);
            long count = map.getOrDefault(a1[i], 0L);
            map.put(a1[i], count + 1);
        }
        
        
        for(int i=0;i<m; i++){
            long count = map.getOrDefault(a2[i], 0l);
            map.put(a2[i], count - 1);
        }
        
        for(int i=0;i<m; i++){
            if(map.get(a2[i]) < 0l){
                return "No";
            }
        }
        
        return "Yes";
    }
}
