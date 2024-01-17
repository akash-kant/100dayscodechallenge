
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        Stack<Integer> s = new Stack<Integer>();
        
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            
            if(max <= arr[i]){
            
                max=arr[i];
                s.push(max);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
    
        while(!s.empty()){
            al.add(s.pop());
        }
        return al;
    }
}
