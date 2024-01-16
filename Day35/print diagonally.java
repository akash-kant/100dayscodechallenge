
//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        ArrayList<Integer> res = new ArrayList<>();
        for (int col = 0; col < N; col++) { // top row
            int i = 0, j = col;
            while (i < N && j >= 0) {
                res.add(A[i++][j--]);
            }
        }
        for (int row = 1; row < N; row++) {
            int i = row, j = N - 1;
            while (i < N && j >= 0) {
                res.add(A[i++][j--]);
            }
        }
        return res;
    }
}
