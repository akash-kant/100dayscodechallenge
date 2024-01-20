

//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        if(a== null || a.length == 0){
            return null;
        }
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(int i = 0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        return new Pair(min , max);
    }
}
