

//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int a[], int n, int X) { 
    
    Arrays.sort(a);
       // Your code Here
        for(int i=0;i<n-2;i++)
        {
            int l=i+1,h=n-1;
            while(l<h)
            {
                if(a[i]+a[l]+a[h] == X)
                {
                    return true;
                }
                
                if(a[i]+a[l]+a[h] > X)
                {
                    h--;
                }
                else
                {
                    l++;
                }
            }
        }
        return false;
    }
}
