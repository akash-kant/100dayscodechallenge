

//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                list.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<list.size() && j<list2.size()){
            arr[k++]=list.get(i++);
            arr[k++]=list2.get(j++);
        }
        while(i<list.size()){
            arr[k++]=list.get(i++);
        }
        while(j<list2.size()){
            arr[k++]=list2.get(j++);
        }
    }
}
