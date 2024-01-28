
//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        
        int carry =0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i =2;i<=N ;i++){
            
            for (int j =0;j<list.size();j++){
                int cal = list.get(j)*i +carry;
                int unit = cal%10; 
                list.set(j,unit);
                carry = cal/10;
            }
             while (carry > 0) {
                list.add(carry % 10);
                carry /= 10;
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
