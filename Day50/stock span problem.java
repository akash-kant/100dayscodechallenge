


class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int count = 0;
        int[] countArr = new int[n];
        countArr[0] = 1;
        boolean isSorted = true;
        for(int i = 1; i < n ; i++){
            if(price[i] < price[i-1]){
                isSorted = false;
            }
        }
        
        for(int i = 1; i < n ; i++){
            if(isSorted){
                countArr[i] = countArr[i-1] + 1;
            }
            else{
            count = 0;
            for(int j = i; j >= 0 && price[j] <= price[i] ; j--)
                count++;
            countArr[i] = count;  
            }
        }
        
        return countArr;
    }
    
}
