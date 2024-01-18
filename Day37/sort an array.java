//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int start = 0, mid = 0, high = n-1;
        while(mid <= high)
        {
            if(a[mid] == 0)
            {
                int temp = a[start];
                a[start] = a[mid];
                a[mid] = temp;
                start++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
            
        }
    }
}
