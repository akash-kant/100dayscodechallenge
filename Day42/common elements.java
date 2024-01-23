

//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> res1 = new ArrayList<Integer>();
        ArrayList<Integer> res2 = new ArrayList<Integer>();
        
        int i=0;
        int j=0;
        
        while(i<n1 && j<n2){
            if(A[i]<B[j]){
                i++;
            }else if(A[i]>B[j]){
                j++;
            }else{
                int n = res1.size();
                if(n==0){
                    res1.add(A[i]);
                }else if(n>0 && res1.get(n-1)!=A[i]){
                    res1.add(A[i]);
                }
                i++;
                j++;
            }
        }
        
        i=0;
        j=0;
        
        while(i<res1.size() && j<n3){
            if(res1.get(i)<C[j]){
                i++;
            }else if(res1.get(i)>C[j]){
                j++;
            }else{
                int n = res2.size();
                if(n==0){
                    res2.add(C[j]);
                }else if(n!=0 && res2.get(n-1)!=C[j]){
                    res2.add(C[j]);
                }
                i++;
                j++;
            }
        }
        return res2;
    }
}
