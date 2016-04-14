// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        
        int n = N;
        int div = n/2;
        int mod = n%2;
        int count = 0;
        boolean betweenOnes = false;
        
        if(mod == 1) {
            betweenOnes = true;
        }
        else if(div == 1) {
            betweenOnes = true;
            count++;
        }
        
        n = div;
        //String backwardBinary = "" + mod;
        int max = count;
        
        while (n >= 1) {
            div = n / 2;
            mod = n % 2;
            
            if(betweenOnes) {
                if(mod == 0) {
                    count++;
                }
                else {
                    if(max < count) {
                        max = count;
                    }
                    count = 0;
                }
            }
            else {
                if(mod == 1) {
                    betweenOnes = true;
                    count = 0;
                }
            }
            
            n = div;
            //backwardBinary += mod;
        }
        
        return max;
    }
}