import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);
        
        int count = 1;
        int last = A[0];
        for(int i = 1; i < A.length; i++) {
            if(A[i] == last) {
                count++;
            }
            else if(count % 2 == 0) {
                count = 1;
                last = A[i];
            }
            else {
                return last;
            }
        }
        return last;
    }
}