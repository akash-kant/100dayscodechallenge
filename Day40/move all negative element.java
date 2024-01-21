

//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : arr){
            if(i<0)  neg.add(i);
            else     pos.add(i);
        }
        int k=0;
        for(int i=0;i<pos.size();i++){
           arr[k++]=pos.get(i);
        }
        for(int i=0;i<neg.size();i++){
            arr[k++]=neg.get(i);
        }
    }
}
