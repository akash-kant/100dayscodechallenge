
//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Arrays.sort(arr);
	   int cc=1;
	   int mc=1;
	   
	   for(int i=1;i<N;i++)
	   {
	       if(arr[i]==arr[i-1]+1)
	       {
	           cc++;
	       }
	       else if(arr[i]!=arr[i-1])
	       {
	           cc=1;
	       }
	       mc=Math.max(cc,mc);
	   }
	   return mc;
	}
}
