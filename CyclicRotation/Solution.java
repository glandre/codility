// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        int N = A.length;
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            R[(i+K)%N] = A[i];
        }
        
        return R;
    }
}