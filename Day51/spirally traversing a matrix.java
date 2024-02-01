
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int mat[][], int r, int c)
    {
        int top = 0;
        int down = r-1;
        int left = 0;
        int right = c-1;
        int dir = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (top <= down && left <= right) {
            if(dir==0){// left to right
                for(int i = left ; i <= right ; i++)
                   ans.add(mat[top][i]);
                top++;
            }
            else if(dir ==1){// top to down
                for(int i = top ; i <= down ; i++)
                  ans.add(mat[i][right]);
                right--;
            }
            else if(dir ==2){//right to left
                for(int i = right; i >= left ; i--)
                 ans.add(mat[down][i]);
                 down--;
            }
            else if(dir==3){//down to top
                for(int i = down; i >= top ; i--)
                  ans.add(mat[i][left]);
                left++;
            }
            dir = (dir+1)%4;
        }
        return ans;
    }
}
