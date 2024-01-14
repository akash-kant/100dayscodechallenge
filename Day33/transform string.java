

//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
        int count[]=new int[256];
        for(int i=0; i<A.length(); i++){
            count[A.charAt(i)]++;
        }
         for(int i=0; i<B.length(); i++){
            count[B.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(count[i] != 0) return -1;
        }
        int i=A.length()-1, j=B.length()-1, ans=0;
        while(i>=0){
            if(A.charAt(i) != B.charAt(j)){
                ans++;
            }
            else{
                j--;
            }
            i--;
        }
        return ans;
    }
}
