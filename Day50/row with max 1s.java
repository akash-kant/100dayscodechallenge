

//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1)
                cnt++;
            }

            if(cnt > max){
                max = cnt;
                idx = i;
            }
        }
        
        if(max == 0)
        return -1;

        return idx;
    }
}
