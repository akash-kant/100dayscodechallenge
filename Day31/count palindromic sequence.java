

/*You are required to complete below method */

class Solution
{
    long[][] dp;
    long mod = (long)1e9+7;
    long countPS(String str)
    {
        // Your code here
        int n = str.length();
        dp = new long[n][n];
        for(long x[]:dp)
        {
            Arrays.fill(x,-1);
        }
        return f(0,n-1,str);
    }
    public long f(int i,int j,String str)
    {
        if(i == j)
        {
            return 1l;
        }
        if(i>j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(str.charAt(i) == str.charAt(j))
        {
            return dp[i][j] = (1l+f(i,j-1,str)%mod+f(i+1,j,str)%mod+mod)%mod;
        }
        else
        {
            return dp[i][j] = (1l*f(i,j-1,str)%mod+f(i+1,j,str)%mod-
            f(i+1,j-1,str)%mod+mod)%mod;
        }
    }
}
