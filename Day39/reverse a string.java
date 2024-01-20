//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char[]arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        return new String(arr);
        
    }
   
}
