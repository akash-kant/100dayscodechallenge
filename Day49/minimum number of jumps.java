

class Solution{
    static int minJumps(int[] arr){
        // your code here
       /* if(h==p)
        return 1;
        
        if(arr[p]==0)
        
        return Integer.MAX_VALUE;
        
        int min=Integer.MAX_VALUE;
        
        for(int i=p+1;i<h && i<=p+arr[p];i++)
        {
            int jumps=minJumps(arr,i,h);
            
            if(jumps!=Integer.MAX_VALUE && jumps+1<min)
            min = jumps+1;
            
        }
        return min;*/


        int jumpCount=0,maxValue=0,curr=0;
        
        for(int i=0;i<arr.length;i++)
        {
            maxValue=Math.max(maxValue,i+arr[i]);
            
            if(curr==i){
                if(i!=arr.length-1)
                jumpCount++;
                curr=maxValue;
            }
        }
        
        if(curr< arr.length-1)
        return -1;
        return jumpCount;
    }
}
