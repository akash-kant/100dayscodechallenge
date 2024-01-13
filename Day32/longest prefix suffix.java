

//User function Template for Java

class Solution {
    int lps(String s) {
        int[] a = new int[s.length()];
        int j = 0, i = 1;
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                a[i] = j+1;
                j++;
                i++;
            } else {
                if(j==0) {
                    i++;
                } else {
                     j = a[j - 1];
                   
                }
            }
        }
        return a[s.length()-1];
    }
}
