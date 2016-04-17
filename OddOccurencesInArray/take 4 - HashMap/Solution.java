// you can also use imports, for example:
import java.util.HashMap;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i = 0; i < A.length; ++i) {
            if(table.containsKey(A[i])) {
                table.put(A[i], table.get(A[i])+1);
            }
            else {
                table.put(A[i], 1);
            }
        }
        
        for(Integer key : table.keySet()) {
            if(table.get(key) % 2 != 0) {
                return key;
            }
        }
        
        // this line shouldn't be executed
        return A[0];
    }
}
