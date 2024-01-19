
//User function Template for Java

class Solution{
    public void zigZag(int a[], int n){
        // Code your solution here. 
        
        Arrays.sort(a);
        int temp[]=new int[n];
        int index=n-1;
        int i=0;
        while(i<n && index>=0){
            temp[index]=a[i];
            index=index-2;
            i++;
        }
        index=1;
        int j=n-1;
        while(index<n && j>=0){
            temp[index]=a[j];
            index=index+2;
            j--;
        }
        
        for(int k=0;k<n;k++){
            a[k]=temp[k];
        }
        // for(int k=0;k<n;k++){
          //  System.out.print(a[k]);
        //}
    }
}
