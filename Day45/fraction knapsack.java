

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    private class Pair implements Comparable<Pair>{
        int val;
        int weight;
        Pair(int v, int w){
            val = v;
            weight = w;
        }
        
        @Override
        public int compareTo(Pair that){
            if((double)that.val/that.weight - (double)this.val/this.weight >= 0)
                return 1;
            else
                return -1;
        }
    }
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0; i<n; i++){
            pq.add(new Pair(arr[i].value, arr[i].weight));
        }
        
        double res = 0;
        while(W > 0 && !pq.isEmpty()){
            Pair curr = pq.poll();
            if(W >= curr.weight){
                res += curr.val;
                W -= curr.weight;
            }
            else{
                res += (double)W/curr.weight*curr.val;
                W = 0;
            }
        }
        
        return res;
    }
}
