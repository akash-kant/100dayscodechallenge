
class Solution
{
    //  static int missingNumber(int arr[], int size) {
    //   Arrays.sort(arr);
    //   int count=1;
    //   for(int i=0;i<arr.length;i++){
    //       if(arr[i]==count)count++;
    //   }
    //   return count;
    // }
     static int missingNumber(int arr[], int size) {
         int max=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             if(arr[i]<0)arr[i]=0;
             if(arr[i]>max)max=arr[i];
         }
         max++;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>0){
                 int ind=arr[i]%max-1;
                 if(ind<size&&ind>=0)arr[ind]+=max;
             }
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i]<max)return i+1;
         }
         return size+1;
     }
}
class Solution
{
    //  static int missingNumber(int arr[], int size) {
    //   Arrays.sort(arr);
    //   int count=1;
    //   for(int i=0;i<arr.length;i++){
    //       if(arr[i]==count)count++;
    //   }
    //   return count;
    // }
     static int missingNumber(int arr[], int size) {
         int max=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             if(arr[i]<0)arr[i]=0;
             if(arr[i]>max)max=arr[i];
         }
         max++;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>0){
                 int ind=arr[i]%max-1;
                 if(ind<size&&ind>=0)arr[ind]+=max;
             }
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i]<max)return i+1;
         }
         return size+1;
     }
}
