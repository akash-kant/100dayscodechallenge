
class GfG
{
    int max_sum(int A[], int n)
    {
        // Formuala==>  S = S1 - C + arr[i-1] *N 
        // S == current Sum
        // S1== Previous Sum 
        // N==size of Array
        // arr[i-1]== (i-1)th element of the array
        int sum=0;
        int s1=0;
        int max=0;
        for (int i=0;i<n;i++){
            sum+=A[i];
            s1+=(A[i]*i);
        }
        
        max=s1;
        
        for (int i=1;i<n;i++){
          int s=s1-sum+ (n*A[i-1]);
          max=Math.max(max,s);
          s1=s;
        }
        
        return max;
    }
}
